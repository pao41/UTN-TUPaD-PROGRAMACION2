package Ejercicio4;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // Lista de Animales 
        ArrayList<Animal> animales = new ArrayList<>();

        // Crear lista de animales y mostrar sus sonidos con polimorfismo
        
        animales.add(new Perro("Max"));
        animales.add(new Gato("Sam"));
        animales.add(new Vaca("Luna"));

        System.out.println("--- Sonidos de animales ---");
        // Recorrer el array
        for (Animal a : animales) {
            
            // La llamada a hacerSonido() ejecuta la versión sobrescrita del objeto (Perro, Gato o Vaca)
            a.hacerSonido();
        }
    }
}
