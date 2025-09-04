
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio5TP2 {

    
    public static void main(String[] args) {
        /* 5. Suma de Números Pares (while).
        Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta que el usuario         ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados */
        
        Scanner input = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese un número (0 para terminar): ");
        int num = Integer.parseInt(input.nextLine());
        
        // Acumulador de la suma de números pares
        int sumaPares = 0;    
        
        // Ciclo While (continúa mientras el número sea distinto de 0)
         while (num != 0) {
            if (num % 2 == 0) { // Verifica si el número es par
                sumaPares += num; // Si es par se suma al acumulador
            }             
             // Solicitar al usuario otro número
            System.out.print("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
         }            
        // Mostrar la suma total de los números pares ingresados
        System.out.println("La suma de los números pares es: " + sumaPares);    
            
        
    }

}
