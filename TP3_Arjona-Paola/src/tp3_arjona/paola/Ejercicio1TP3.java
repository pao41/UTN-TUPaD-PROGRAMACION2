
package tp3_arjona.paola;


public class Ejercicio1TP3 {
    /* 1. Registro de Estudiantes
    a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
    Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
    Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.*/
    
    // Clase principal para la prueba de la clase Estudiante (creada aparte bajo el nombre: Estudiante.java)
    public static void main(String[] args) {
        // Crear un objeto Estudiante
        Estudiante es = new Estudiante();

        // Asignar valores a sus atributos
        es.nombre = "Ana";
        es.apellido = "Perez";
        es.curso = "Programacion 2";
        es.calificacion = 8;

        // Probar los métodos
        es.mostrarInfo(); // Se muestra la información actual
        
        es.subirCalificacion(2); // Se sube la calificación en 2 puntos
        es.mostrarInfo(); // Se comprueba el nuevo valor
        
        es.bajarCalificacion(3); // Se baja la calificación en 3 puntos
        es.mostrarInfo(); // Se comprueba el nuevo valor
    }

}
