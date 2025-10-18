package Ejercicio2;

// Subclase
public class Rectangulo extends Figura { // Se extiende de figura
    private double base;
    private double altura;
    
    // Constructor
    public Rectangulo(double base, double altura, String nombre) {
        super(nombre); // Llama al constructor de Figura
        this.base = base;
        this.altura = altura;
    }

    // Implementar el método abstracto calcularArea()
    @Override
    public double calcularArea() {
        return base * altura; // Formula del área del rectángulo
    }

}
