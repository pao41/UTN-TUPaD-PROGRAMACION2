package casopractico3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    // Getter para nombre 
    public String getNombre() {
        return nombre;
    }

    // 1. agregarProfesor(Profesor p)
    public void agregarProfesor(Profesor p) {
        if (p == null) return;
        profesores.add(p);
        System.out.println("- Profesor agregado: " + p.getNombre());
    }

    // 2. agregarCurso(Curso c)
    public void agregarCurso(Curso c) {
        if (c == null) return;
        cursos.add(c);
        System.out.println("- Curso agregado: " + c.getNombre());
    }

    // 3. asignarProfesorACurso(String codigoCurso, String idProfesor)
    // Utiliza setProfesor del Curso, que maneja la sincronización bidireccional
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor p = buscarProfesorPorId(idProfesor);
        Curso c = buscarCursoPorCodigo(codigoCurso);

        if (p == null) {
            System.out.println("Error: Profesor con ID " + idProfesor + " no encontrado");
            return false;
        }
        if (c == null) {
            System.out.println("Error: Curso con código " + codigoCurso + " no encontrado");
            return false;
        }

        // Llama al setter del Curso, que maneja la logica de sincronización 
        c.setProfesor(p); 
        return true;
    }

    // 4a. listarProfesores()
    public void listarProfesores() {
        System.out.println("\n--- Profesores en " + nombre + " ---");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados");
            return;
        }
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }
    
    // 4b. listarCursos()
    public void listarCursos() {
        System.out.println("\n--- Cursos en " + nombre + " ---");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados");
            return;
        }
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    // 5. buscarProfesorPorId(String id)
    public Profesor buscarProfesorPorId(String id) {
        if (id == null || id.isEmpty()) return null;
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    // 6. buscarCursoPorCodigo(String codigo)
    public Curso buscarCursoPorCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty()) return null;
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }

    // 7. eliminarCurso(String codigo) → Debe romper la relación con su profesor si lo hubiera
    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            // Romper la relación bidireccional si existe (sincronización)
            if (c.getProfesor() != null) {
                // Al llamar a setProfesor(null), el Curso se encarga de llamar a profesor.eliminarCurso(this) 
                // para limpiar el lado del Profesor
                c.setProfesor(null); 
            }
            cursos.remove(c);
            System.out.println("Curso eliminado: " + c.getNombre());
            return true;
        }
        System.out.println("Error: Curso con código " + codigo + " no encontrado.");
        return false;
    }

    // 8. eliminarProfesor(String id). Antes de remover, dejar null los cursos que dictaba
    public boolean eliminarProfesor(String id) {
    Profesor p = buscarProfesorPorId(id);
    if (p != null) {
        // Iterar sobre una copia y asegurar que todos los cursos se desasocien correctamente
        for (Curso c : new ArrayList<>(p.getCursos())) {
            // setProfesor(null) se encarga de la limpieza en ambos lados
            c.setProfesor(null);
        }
        profesores.remove(p);
        System.out.println("Profesor eliminado: " + p.getNombre() + ". Sus cursos fueron desasociados");
        return true;
    }
    System.out.println("Error: Profesor con ID " + id + " no encontrado");
    return false;
}
    
    // Reporte: cantidad de cursos por profesor
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n--- Reporte: Cantidad de Cursos por Profesor ---");
        for (Profesor p : profesores) {
            // Utiliza getCursos().size() para obtener la cuenta
            System.out.println("- " + p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }
}
