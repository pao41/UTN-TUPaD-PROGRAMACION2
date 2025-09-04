
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio10TP2 {
    /* 10. Actualización de stock a partir de venta y recepción de productos.
    Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), que calcule el nuevo stock después de       una venta y recepción de productos:
    -NuevoStock = StockActual − CantidadVendida + CantidadRecibida
    -NuevoStock = CantidadVendida + CantidadRecibida
    Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado. */
    
    // Metodo actualizarStock -----------------------------------------------
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){        
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;      
        return nuevoStock; // Devuelve el stock calculado
    }    
    // Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        // Solicitar datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        
        // Se llama al método calcularCostoEnvio y calcularTotalCompra
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostrar el resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);        
        
    }

}
