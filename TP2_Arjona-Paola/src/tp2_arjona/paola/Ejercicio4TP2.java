
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio4TP2 {

    
    public static void main(String[] args) {
        /* 4. Calculadora de Descuento según categoría.
        Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
        Luego, aplique los siguientes descuentos:
        Categoría A: 10% de descuento
        Categoría B: 15% de descuento
        Categoría C: 20% de descuento
        El programa debe mostrar el precio original, el descuento aplicado y el precio final */
        
        Scanner input = new Scanner(System.in);
        // Solicitar datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precio_product = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        char cat_producto = input.next().charAt(0); // Leer un solo carácter       
       
        double descuento = 0; // Variable para almacenar el porcentaje de descuento
        
        // Aplicación de descuentos según categoria
        switch(cat_producto){
            case 'A', 'a' -> // Si la categoría es 'A'
                descuento = 10; // 10% de descuento
            case 'B', 'b' -> // 
                descuento = 15; // 15% de descuento
            case 'C', 'c' -> // 
                descuento = 20; // 20% de descuento
            default -> // Si la categoría no es A, B ni C
                System.out.println("Categoría inválida. No se aplicará descuento.");
        }
        // Aplicación del descuento
        double precioFinal = precio_product - (precio_product * descuento / 100);
        
        // Mostrar resultados
        System.out.println("Precio original: " + precio_product);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: " + precioFinal);                            
        
    }

}
