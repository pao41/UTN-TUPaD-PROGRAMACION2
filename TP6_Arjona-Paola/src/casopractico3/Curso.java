package casopractico3;

public class Curso {
    private String codigo; // Codigo unico
    private String nombre; // Nombre del curso
    private Profesor profesor; // Profesor responsable

    // Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Inicialmente sin profesor
    }

    // Metodo Set Profesor: Asigna/cambia el profesor sincronizando ambos lados: Si tenía profesor previo, quitarse de su lista
    public void setProfesor(Profesor p) {
        // 1) Previene la auto-asignación y la recursión infinita
        if (this.profesor == p) {
            return;
        }

        // 2) Si tenía un profesor anterior, lo eliminamos de su lista
        if (this.profesor != null) {
            Profesor profesorAnterior = this.profesor;
            this.profesor = null;
            profesorAnterior.eliminarCurso(this);
        }

        // 3) Asignar el nuevo profesor
        this.profesor = p;

        // 4) Sincronización (Mantenimiento de la Invariante)
        if (p != null) {
            // Llama al método de adición del nuevo profesor SOLO si el curso no está ya en su lista
            if (!p.getCursos().contains(this)) {
                p.agregarCurso(this); 
            }
        }
    }

    // Método para mostrar información: Muestra código, nombre y nombre del profesor (si tiene).
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + nombre + " | Codigo: " + codigo + " | Profesor: " + nombreProfesor);
    }
    
    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

}
