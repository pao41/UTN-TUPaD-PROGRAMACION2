
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio9TP2 {   
    /* 9. Composición de funciones para calcular costo de envío y total de compra.
    a. calcularCostoEnvio(double peso, String zona)
    Nacional: $5 por kg
    Internacional: $10 por kg
    b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el        costo de envío.
    c. Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar. */
    
    // Metodo calcularCostoEnvio -----------------------------------------------
    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio = 0; // Inicializa la variable para guardar el costo calculado
        // Costo de acuerdo a la zona de envio
        if (zona.equalsIgnoreCase("Nacional")){
            costoEnvio = peso * 5; // Costo nacional: $5 por kg          
        } else if (zona.equalsIgnoreCase("Internacional")){ // Costo internacional: $10 por kg
            costoEnvio = peso * 10;
        } else {
            System.out.println("Zona inválida"); // Si el usuario ingresa una zona inválida
        }
        return costoEnvio; // Devuelve el costo calculado
    }    
    // Metodo calcularTotalCompra ----------------------------------------------
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        // Calcula el total de la compra sumando precio del producto + costo de envío
        return precioProducto + costoEnvio; // Devuelve el total a pagar
    }            
    // Main --------------------------------------------------------------------
    public static void main(String[] args) {
              
        Scanner input = new Scanner(System.in); 
        
        // Solicitar datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = input.nextLine();
        
        // Se llama al método calcularCostoEnvio y calcularTotalCompra
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

        // Mostrar el resultado
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
        
    }

}
