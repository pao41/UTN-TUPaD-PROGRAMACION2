package Ejercicio3;

// Clase abstracta base
public abstract class Empleado {
    // Atributo 
    protected String nombre; 
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que cada tipo de empleado implementará distinto
    public abstract double calcularSueldo(); 

    public String getNombre() {
        return nombre;
    }
}
