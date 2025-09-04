
package tp2_arjona.paola;

import java.util.Scanner;


public class Ejercicio11TP2 {
    /* 11. Cálculo de descuento especial usando variable global.
    Declara una variable global Ejemplo de entrada/salida: = 0.10. 
    Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del       10%
    Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con          descuento */
    
    // Variable global (disponible para los métodos de la clase) ---------------
    public static double descuentoEspecial = 0.10;
    
    // Método calcularDescuentoEspecial ----------------------------------------
    public static void calcularDescuentoEspecial(double precio) {
    
        // Descuento aplicado (10%)    
        double descuentoAplicado = descuentoEspecial * precio;
        // Precio final del prodcuto (con descuento)
        double precioFinal = precio - descuentoAplicado;
    
        // Mostrar el resultado (cuando se solicite)
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
        }
    // Main --------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        // Solicitar datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        
        // Se llama al método calcularDescuentoEspecial
        calcularDescuentoEspecial(precio);
        
    }

}
