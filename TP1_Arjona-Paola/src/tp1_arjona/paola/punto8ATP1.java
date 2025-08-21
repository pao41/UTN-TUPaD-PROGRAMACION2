
package tp1_arjona.paola;

import java.util.Scanner;


public class punto8ATP1 {

    
    public static void main(String[] args) {
        // 8a.Escribe un programa que divida dos números enteros ingresados por el usuario.
        Scanner input = new Scanner(System.in);
        // Declaracion de variables
        int num1, num2, division;
        // Solicitar datos al usuario
        System.out.print("Ingrese el primer numero entero: ");
        num1 = Integer.parseInt( input.nextLine() );
        
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = Integer.parseInt( input.nextLine() );
        
        // Operación
        division = (num1 / num2);
        
        // Mostrar resultado
        System.out.println("El resultado de la division entera es: " + division);
               
    }

}
