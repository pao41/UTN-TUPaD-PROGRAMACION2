
package tp3_arjona.paola;


public class Ejercicio3TP3 {
    /* 3. Encapsulamiento con la Clase Libro
    a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
    Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
    Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.*/
   
    // Clase principal para la prueba de la clase Libro (creada aparte bajo el nombre: Libro.java)
    public static void main(String[] args) {
        // Crear un objeto libro
        Libro lb = new Libro();
        
         // Mostrar información inicial (título y autor se ponen como texto fijo porque no hay setters)
        System.out.println("Informacion inicial"); 
        System.out.println("Título: Harry Potter y la piedra filosofal");
        System.out.println("Autor: J.K. Rowling");
        System.out.println("Año de publicación: " + lb.getAnioPublicacion()); // El año se consulta con getter, al inicio es 0 porque todavía no se cargó.
        
        // Intento 1: asignar un año inválido
        lb.setAnioPublicacion(2050);  // debería mostrar "Año inválido"

        // Intento 2: asignar un año válido
        lb.setAnioPublicacion(1997);  // año correcto de publicación, y el setter lo guarda en el atributo

        // Mostrar información final
        System.out.println("\nInformacion final"); 
        System.out.println("Titulo: Harry Potter y la piedra filosofal");
        System.out.println("Autor: J.K. Rowling");
        System.out.println("Año de publicacion: " + lb.getAnioPublicacion());
        
    }

}
