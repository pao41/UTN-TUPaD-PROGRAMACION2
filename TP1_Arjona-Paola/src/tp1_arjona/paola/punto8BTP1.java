
package tp1_arjona.paola;

import java.util.Scanner;


public class punto8BTP1 {

    
    public static void main(String[] args) {
        // 8b.Modifica el código para usar double en lugar de int y compara los resultados.
        Scanner input = new Scanner(System.in);
        // Declaracion de variables
        double num1, num2, division;
        // Solicitar datos al usuario
        System.out.print("Ingrese el primer numero: ");
        num1 = Double.parseDouble( input.nextLine() );
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Double.parseDouble( input.nextLine() );
        
        // Operación
        division = (num1 / num2);
        
        // Mostrar resultado
        System.out.println("El resultado de la division es: " + division);
    }

}
