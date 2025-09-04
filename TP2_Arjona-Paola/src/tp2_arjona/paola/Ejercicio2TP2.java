
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio2TP2 {

    
    public static void main(String[] args) {
        /* 2. Determinar el Mayor de Tres Números. 
        Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor. */
        
        Scanner input = new Scanner(System.in);
         //Declaracion de variables
        int num1, num2, num3;
        
        // Solicitar datos al usuario
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt( input.nextLine() );
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt( input.nextLine() );
        
        System.out.print("Ingrese el tercer numero: ");
        num3 = Integer.parseInt( input.nextLine() );
        
        // Determinar el mayor usando estructuras condicionales
        int mayor; // Se declara la variable que almacenará el número mayor
        if (num1 >= num2 && num1 >= num3) { // Se verifica si el primer número es mayor o igual que los otros dos
            mayor = num1; // Si se cumple, num1 es el mayor
        } else if (num2 >= num1 && num2 >= num3) { // Se verifica si el segundo número es mayor o igual que los otros dos
            mayor = num2; // Si se cumple, num2 es el mayor
        } else { // Si ninguna de las condiciones anteriores se cumple, el tercer número es el mayor
            mayor = num3; // num3 es el mayor
        }
        // Mostrar el resultado
        System.out.println("El mayor es: " + mayor);

        
    }

}
