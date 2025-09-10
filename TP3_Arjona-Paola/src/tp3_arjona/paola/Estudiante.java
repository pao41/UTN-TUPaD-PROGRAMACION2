package tp3_arjona.paola;

// Se define la clase Estudiante
public class Estudiante {
    // Atributos
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    // Métodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos){
        calificacion += puntos;
    }
    
    public void bajarCalificacion(double puntos){
        calificacion -= puntos;
    }
    
}
