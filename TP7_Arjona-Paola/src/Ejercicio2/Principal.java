package Ejercicio2;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // Lista vacía
        ArrayList<Figura> figuras = new ArrayList<>();
        
        // Crear un array de figuras y mostrar el área de cada una
        // Rectangulo(base, altura, nombre)
        Rectangulo r1 = new Rectangulo(8.0, 5.0, "Rectangulo A");
        Rectangulo r2 = new Rectangulo(3.0, 9.0, "Rectangulo B");
        // Circulo(radio, nombre)
        Circulo c1 = new Circulo(7.0, "Circulo 1");
        Circulo c2 = new Circulo(1.5, "Circulo 2");

        figuras.add(r1);
        figuras.add(r2);
        figuras.add(c1);
        figuras.add(c2);
        
        // Recorrer la lista y llamar al metodo calcularArea()
        for(Figura f : figuras){       
            System.out.printf("Figura: %s, su area es %.2f%n", f.nombre, f.calcularArea());
        }
    }

}
