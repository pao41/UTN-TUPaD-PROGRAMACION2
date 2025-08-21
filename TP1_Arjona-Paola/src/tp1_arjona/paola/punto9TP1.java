
package tp1_arjona.paola;

import java.util.Scanner;


public class punto9TP1 {

    
    public static void main(String[] args) {
        // 9.Corrige el siguiente código para que funcione correctamente.
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // Coregido: se reemplazó nextInt() por nextLine()
        System.out.println("Hola, " + nombre);
        
    }

}
