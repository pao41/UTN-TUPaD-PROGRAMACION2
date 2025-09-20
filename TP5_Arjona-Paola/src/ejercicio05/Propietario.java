package ejercicio05;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Bidireccional

    // Constructor
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getter y Setter
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public Computadora getComputadora() { return computadora; }
    public void setComputadora(Computadora computadora) { 
        this.computadora = computadora;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

}
