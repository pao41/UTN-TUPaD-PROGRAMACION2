package Ejercicio3;

// Subclase
public class EmpleadoPlanta extends Empleado {
    // Atributo específico
    private double sueldoBase = 1000000.0; 

    public EmpleadoPlanta(String nombre) {
        super(nombre); // Llama al constructor del padre
    }

    // Sobrescritura 
    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }
}
