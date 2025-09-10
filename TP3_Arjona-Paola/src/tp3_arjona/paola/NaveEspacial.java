package tp3_arjona.paola;

// Se define la clase NaveEspacial
public class NaveEspacial {
    // Atributos
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; // límite máximo de tanque de combustible
    
    // Constructor: inicializa la nave espacial con un nombre y un nivel de combustible
     public NaveEspacial(String nombre, int combustible) {
       this.nombre = nombre; // asigna el nombre recibido al atributo "nombre"
       this.combustible = combustible; // asigna el combustible recibido al atributo "combustible"
    }
    
    // Métodos
    // Método para simular el despegue de la nave
    public void despegar() {
        if (combustible > 0) { // Si hay combustible, la nave despega
            System.out.println("Despegue: " + nombre + " despego con " + combustible + " unidades de combustible.");
        } else {  // Si no hay combustible, no puede despegar
            System.out.println("No puede despegar. Sin combustible");
        }
    }
    // Método para avanzar (recibe como parámetro la distancia en km)
    public void avanzar(int distancia) {
        int consumo = distancia / 10; // regla: 1 unidad de combustible cada 10km de distancia
        if (combustible >= consumo) { // Revisa si la nave tiene suficiente combustible para cubrir el consumo.
            combustible -= consumo; // Si tiene suficiente, le resta el consumo al combustible disponible.
            System.out.println("Distancia y Combustible: " + nombre + " avanzo " + distancia + " km. Combustible consumido: " + consumo  + ". Restante: " + combustible); // Mensaje con la distancia recorrida y el combustible que queda.
        } else { // Si no alcanza el combustible, se informa el error
            System.out.println("No tiene suficiente combustible para avanzar " + distancia + " km.");
        }        
    }
    // Método para recargar combustible (recibe como parámetro la cantidad a recargar)
    public void recargarCombustible(int cantidad) {
         if (combustible + cantidad > MAX_COMBUSTIBLE) { // Revisa si al sumar esa cantidad se pasa del máximo permitido (100).
            combustible = MAX_COMBUSTIBLE; // Si la recarga supera el máximo, lo deja en 100 (tope del tanque).
            System.out.println("El tanque se llenó al máximo (" + MAX_COMBUSTIBLE + ")");
        } else {  // Si no supera, se suma normalmente
            combustible += cantidad; // Suma la cantidad al combustible actual
            System.out.println("Se recargaron " + cantidad + " unidades. Combustible Actual: " + combustible);
        }
    }
     // Método para mostrar el estado actual de la nave
    public void mostrarEstado() {
        System.out.println("\n***** Estado de la nave ****");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
       
    }
}
