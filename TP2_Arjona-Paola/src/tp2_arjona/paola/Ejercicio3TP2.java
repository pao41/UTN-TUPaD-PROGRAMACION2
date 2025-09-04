package tp2_arjona.paola;

import java.util.Scanner;

public class Ejercicio3TP2 {

    public static void main(String[] args) {
        /* 3. Clasificación de Edad. 
        Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida.
        Menor de 12 años: "Niño"
        Entre 12 y 17 años: "Adolescente"
        Entre 18 y 59 años: "Adulto"
        60 años o más: "Adulto mayor" */

        Scanner input = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());

        // Clasificación de su etapa de vida
        if (edad < 12) {
            System.out.println("Eres un niño");
        } else if (edad >= 12 && edad <= 17){
            System.out.println("Eres un adolescente");
        } else if (edad >= 18 && edad <= 59){
            System.out.println("Eres un adulto");        
        } else { // edad >= 60
            System.out.println("Eres un adulto mayor");    
        }
                  
    }

}
