
package tp3_arjona.paola;


public class Ejercicio2TP3 {
    /* 2. Registro de Mascotas
    a. Crear una clase Mascota con los atributos: nombre, especie, edad.
    Métodos requeridos: mostrarInfo(), cumplirAnios().
    Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.*/

    // Clase principal para la prueba de la clase Mascota (creada aparte bajo el nombre: Mascota.java)
    public static void main(String[] args) {
        // Crear un objeto mascota
        Mascota ms = new Mascota();
        // Atributos
        ms.nombre = "Sam";
        ms.especie = "Perro";
        ms.edad = 2;
        
         // Probar los métodos
        ms.mostrarInfo(); // mostrar info actual

        ms.cumplirAnios(); // la mascota cumple un año
        
        ms.mostrarInfo();  // mostrar info actualizada
               
    }
}
