package Ejercicio2;

// Clase abstracta que representa una figura geométrica
public abstract class Figura {
    protected String nombre; // Atributo

    // Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para calcular area
    public abstract double calcularArea(); // Declaración de comportamiento

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
    }

}
