
package tp1_arjona.paola;

import java.util.Scanner;


public class punto4TP1 {

    
    public static void main(String[] args) {
        // 4.Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego los muestre en pantalla. 
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        // Mostrar resultados
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
    }

}
