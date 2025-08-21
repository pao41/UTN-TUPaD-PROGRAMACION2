
package tp1_arjona.paola;

import java.util.Scanner;


public class punto5TP1 {

    
    public static void main(String[] args) {
        // 5.Escribe un programa que solicite dos números enteros y realice las siguientes operaciones: S, R, M, D
        Scanner input = new Scanner(System.in);
        //Declaracion de variables
        int num1, num2, suma, resta, multiplicacion;
        double division;
        // Solicitar datos al usuario
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt( input.nextLine() );
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt( input.nextLine() );
        // Operaciones
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = ((double) num1 / num2);
        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
               
    }

}
