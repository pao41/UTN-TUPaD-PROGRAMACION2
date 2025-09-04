
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio13TP2 {

    /* 13. Impresión recursiva de arrays antes y después de modificar un elemento.
    Crea un programa que:
    a. Declare e inicialice un array con los precios de algunos productos.
    b. Use una función recursiva para mostrar los precios originales.
    c. Modifique el precio de un producto específico.
    d. Use otra función recursiva para mostrar los valores modificados. */
    
    // Función recursiva para imprimir los precios de un array
    public static void imprimirPreciosRecursivo(double[] precios, int indice) {
        // Caso base: si el índice llega al tamaño del array, termina la recursión
        if (indice == precios.length) {
            return; // Sale de la función, no hay más elementos que imprimir
        }
        // Imprimir el precio actual del array en la posición "indice"
        System.out.println("Precio: $" + precios[indice]);
        
        // Llamada recursiva para imprimir el siguiente elemento (indice + 1)
        imprimirPreciosRecursivo(precios, indice + 1);
    }
    
    public static void main(String[] args) {
        // Declaración e inicialización del array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Mostrar precios originales usando función recursiva
        System.out.println("Precios originales:");
        imprimirPreciosRecursivo(precios, 0); // índice inicial 0
        
        // Scanner para solicitar datos al usuario
        Scanner input = new Scanner(System.in);
        
        // Solicitar al usuario el índice del producto a modificar
        int indice;
        do {
            System.out.print("Ingrese el índice del producto a modificar (0-4): ");
            indice = Integer.parseInt(input.nextLine());
            if (indice < 0 || indice >= precios.length) {  // Valida si el índice está fuera del rango válido
                System.out.println("Índice inválido. Intente nuevamente.");  // Si está fuera de rango muestra error
            }
        } while (indice < 0 || indice >= precios.length); // El ciclo se repite mientras el índice sea inválido

        // Solicitar al usuario el nuevo precio del producto seleccionado
        System.out.print("Ingrese el nuevo precio del producto seleccionado: ");
        double nuevoPrecio = Double.parseDouble(input.nextLine());

        // Modificar el valor en el array en el índice indicado
        precios[indice] = nuevoPrecio;

        // Mostrar precios modificados usando función recursiva
        System.out.println("Precios modificados:");
        imprimirPreciosRecursivo(precios, 0); // Volver a empezar desde el índice 0
    }

}
