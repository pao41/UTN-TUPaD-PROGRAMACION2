package Ejercicio3;

// Subclase
public class EmpleadoTemporal extends Empleado {
    // Atributo específico
    private double sueldoFijo = 800000.0 ; 

    public EmpleadoTemporal(String nombre) {
        super(nombre); // Llama al constructor del padre
    }

    // Sobrescritura 
    @Override
    public double calcularSueldo() {
        return sueldoFijo;
    }

}
