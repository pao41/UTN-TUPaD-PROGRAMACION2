
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio12TP2 {

    
    public static void main(String[] args) {
        /* 12. Modificación de un array de precios y visualización de resultados.
        Crea un programa que:
        a. Declare e inicialice un array con los precios de algunos productos.
        b. Muestre los valores originales de los precios.
        c. Modifique el precio de un producto específico.
        d. Muestre los valores modificados. */
        
        // Declaración e inicialización del array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Mostrar precios originales usando un for-each
        System.out.println("Precios originales:");
        for (double precio : precios) { // Recorre cada elemento del array
            System.out.println("Precio: $" + precio); // "precio" toma el valor de cada elemento en cada iteración y se imprime el              precio actual
        }
        
        // Crear Scanner para solicitar datos al usuario
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario el índice del producto a modificar (0 a 4)
        int indice;
        do {
            System.out.print("Ingrese el índice del producto a modificar (0-4): ");
            indice = Integer.parseInt(input.nextLine());
            if (indice < 0 || indice >= precios.length) {  // Valida si el índice está fuera del rango válido
                System.out.println("Índice inválido. Intente nuevamente.");  // Si está fuera de rango muestra error
            }
        } while (indice < 0 || indice >= precios.length); // El ciclo se repite mientras el índice sea inválido

        // Solicitar al usuario el nuevo precio del producto
        System.out.print("Ingrese el nuevo precio del producto seleccionado: ");
        double nuevoPrecio = Double.parseDouble(input.nextLine());
        
        // Modificar el valor del array en el índice indicado
        precios[indice] = nuevoPrecio;

        // Mostrar los valores modificados
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }

}
