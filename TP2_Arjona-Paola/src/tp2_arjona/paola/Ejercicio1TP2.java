
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio1TP2 {

    
    public static void main(String[] args) {
        /*1. Verificación de Año Bisiesto. 
        Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto.*/
        
        Scanner input = new Scanner(System.in);
        // Declaracion de variables
        int anio1;
        
        // Solicitar datos al usuario
        System.out.print("Ingrese un año: ");
        anio1 = Integer.parseInt( input.nextLine() );
        
        // Verificacion de año bisiesto
         if ((anio1 % 4 == 0 && anio1 % 100 != 0) || (anio1 % 400 == 0)) {
            System.out.println("El año " + anio1 + " es un año bisiesto");
        } else {
            System.out.println("El año " + anio1 + " no es un año bisiesto");
        }       
    }

}
