package casopractico3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * Representa a un Profesor con id, nombre, especialidad y la lista de cursos que dicta. 
   Provee métodos para añadir/quitar cursos manteniendo la sincronización bidireccional con Curso.
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad; // Area principal  
    private final List<Curso> cursos = new ArrayList<>(); // Cursos que dicta

    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Metodo Agregar Curso: Agrega el curso a su lista si no está y sincroniza el lado del curso
    // Mantiene la sincronización bidireccional llamando a c.setProfesor(this) solo si es necesario
    public void agregarCurso(Curso c) {
        // Validación de entrada
        if (c == null) {
            System.out.println("Error: No se puede agregar un curso nulo");
            return;
        }

        // Evitar duplicados en la lista del profesor
        if (!cursos.contains(c)) {
            cursos.add(c);
            
            if (c.getProfesor() != this) {
                c.setProfesor(this); 
            }
            System.out.println("Profesor " + nombre + " asociado al curso " + c.getNombre());
        }
    }

    // Metodo Eliminar Curso: Quita el curso y sincroniza el lado del curso (dejar profesor en null si corresponde)
    public void eliminarCurso(Curso c) {
        // Si el curso está en la lista
        if (cursos.remove(c)) {
            // Mantenimiento de la Invariante
            // Si el curso tenía asignado como profesor, se desasocia
            if (c.getProfesor() == this) {
                // Sincroniza el lado 'N'
                c.setProfesor(null); 
            }
            System.out.println("Profesor " + nombre + " desasociado de Curso " + c.getNombre());
        }
    }

    // Método para listar los cursos: lista de cursos que dicta el profesor
    public void listarCursos() {
        System.out.println("\n--- Cursos dictados por " + nombre + " (" + especialidad + ") ---");
        if (cursos.isEmpty()) {
            System.out.println("Actualmente no dicta cursos.");
            return;
        }
        for (Curso curso : cursos) {
            System.out.println(" - Codigo: " + curso.getCodigo() + ", Nombre: " + curso.getNombre());
        }
    }
    
    // Método para mostrar información: Muestra nombre, id, especialidad y cantidad de cursos que dicta
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | ID: " + id + " | Especialidad: " + especialidad + " | Cursos: " + cursos.size());
    }

    // Getters
    // Devuelve una vista inmutable de la lista de cursos para preservar encapsulamiento
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { 
        // Encapsulamiento: devuelve una lista inmutable
        return Collections.unmodifiableList(cursos); 
    }

}
