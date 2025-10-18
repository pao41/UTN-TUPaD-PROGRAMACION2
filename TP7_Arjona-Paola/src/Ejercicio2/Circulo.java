package Ejercicio2;

// Subclase
import static java.lang.Math.PI;

public class Circulo extends Figura { // Se extiende de figura
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    // Implementar el método abstracto calcularArea()
    @Override
    public double calcularArea() {
        return PI * radio * radio; // Fórmula del área del círculo
    }
}
