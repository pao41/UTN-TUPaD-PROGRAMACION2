package ejercicio07;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Bidireccional

    // Constructor vacío
    public Conductor() {}

    // Constructor con parámetros
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public Vehiculo getVehiculo() { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }

    @Override
    public String toString() {
        return "Conductor: " + nombre;
}

}
