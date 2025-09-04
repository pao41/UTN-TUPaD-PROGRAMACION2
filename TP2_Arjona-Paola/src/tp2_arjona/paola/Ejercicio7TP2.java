
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio7TP2 {

    
    public static void main(String[] args) {
        /* 7. Validación de Nota entre 0 y 10 (do-while).
        Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un número fuera de este rango, debe            seguir pidiéndole la nota hasta que ingrese un valor válido. */
        
        Scanner input = new Scanner(System.in);
        
        // Variable para almacenar la nota
        int nota; 
        
         // Estructura repetitiva: do-while (pide la nota y valida hasta que se encuentre en rango (0 a 10))
        do {
            System.out.print("Ingrese una nota (0-10): "); // Solicitar dato al usuario
            nota = Integer.parseInt(input.nextLine()); 

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10); // Mientras la nota no esté entre 0 y 10, sigue solicitando el número

        // Si se ingreso nota entre 0 y 10, significa que la nota es válida
        System.out.println("Nota guardada correctamente.");

        
    }

}
