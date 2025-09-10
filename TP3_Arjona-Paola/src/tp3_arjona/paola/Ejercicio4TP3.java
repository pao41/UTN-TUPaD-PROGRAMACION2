
package tp3_arjona.paola;


public class Ejercicio4TP3 {
    /* 4. Gestión de Gallinas en Granja Digital
    a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
    Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
    Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado*/
    
    // Clase principal para la prueba de la clase Gallina (creada aparte bajo el nombre: Gallina.java)
    public static void main(String[] args) {
        // Crear objeto
        Gallina ga1 = new Gallina();
        Gallina ga2 = new Gallina();
        
        // Asignar valores iniciales a los objetos
        ga1.idGallina = 1;
        ga1.edad = 3;          // 3 años
        ga1.huevosPuestos = 4; 

        ga2.idGallina = 2;
        ga2.edad = 1;          // 1 año
        ga2.huevosPuestos = 3;
        
        // Simular acciones (envejecer y poner huevos)
        // Gallina 1
        ga1.envejecer();   // ga1 ahora tiene 4 años
        ga1.ponerHuevo(); // ga1 ahora 5 huevos
        ga1.ponerHuevo(); // ga1 ahora 6 huevos
        
        // Gallina 2
        ga2.envejecer();   // ga2 ahora tiene 2 años
        ga2.envejecer();   // ga2 ahora tiene 3 años
        ga2.ponerHuevo(); // ga2 ahora 4 huevos
        
        // Mostrar estado final de cada gallina
        System.out.println("Estado de las gallinas");
        System.out.println("\nEstado Gallina 1");
        ga1.mostrarEstado();
        System.out.println("\nEstado Gallina 2");
        ga2.mostrarEstado();
    }

}
