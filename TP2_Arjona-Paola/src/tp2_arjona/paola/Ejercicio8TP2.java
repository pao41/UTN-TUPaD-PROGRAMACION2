
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio8TP2 {

    /* 8. Cálculo del Precio Final con impuesto y descuento.
    Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce.      La fórmula es:
    PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
    PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
    Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y           muestra el precio final. */
    
    // Método para calcular el precio final (con impuesto y descuento) 
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convierte los porcentajes a decimales (ej 10% a 0.10)
        double impDecimal = impuesto / 100;
        double descDecimal = descuento / 100;

        // Fórmula: PrecioBase + (PrecioBase × Impuesto) - (PrecioBase × Descuento)
        double precioFinal = precioBase + (precioBase * impDecimal) - (precioBase * descDecimal);
        return precioFinal; // Retorna el resultado              
    }
    
    // Main
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        
        // Solicitar datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(input.nextLine());
        
        // Se llama al método calcularPrecioFinal y se guarda el resultado
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostrar el resultado
        System.out.println("El precio final del producto es: " + precioFinal);
    }
   
}
