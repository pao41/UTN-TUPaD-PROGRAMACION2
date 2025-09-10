
package tp3_arjona.paola;


public class Ejercicio5TP3 {
    /* 5. Simulación de Nave Espacial
    Crear una clase NaveEspacial con los atributos: nombre, combustible.
    Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
    Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
    Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente.            Mostrar el estado al final. */
    
    // Clase principal para la prueba de la clase NaveEspacial (creada aparte bajo el nombre: NaveEspacial.java)
    public static void main(String[] args) {
        
        // Crear objeto NaveEspacial
        NaveEspacial nave = new NaveEspacial("Nave07", 50); // Crea un objeto de tipo NaveEspacial. Se llama nave, su nombre es                 "Nave07" y tiene 50 de combustible.
        // Llama al método despegar()
        nave.despegar();  // Intenta despegar

        nave.avanzar(600); // Intenta avanzar 600 km. Como consume mucho, no alcanza el combustible.

        nave.recargarCombustible(40); // Recarga 40 unidades de combustible

        nave.avanzar(200); // Avanza correctamente 200 km

        // Mostrar estado final
        nave.mostrarEstado();
        
    }

}
