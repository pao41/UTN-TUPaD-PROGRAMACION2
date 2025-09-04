
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio6TP2 {

    
    public static void main(String[] args) {
        /* 6. Contador de Positivos, Negativos y Ceros (for).
        Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son             ceros */
        
        Scanner input = new Scanner(System.in);

         // Contadores inicializados en 0
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        // Ciclo for para solicitar 10 números al usuario
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = Integer.parseInt(input.nextLine());

            // Verificar si el número es positivo, negativo o cero
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else { // num == 0
                ceros++;
            }
        }
        
        // Mostrar los resultados
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
    }

}
