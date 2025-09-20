package ejercicio03;

public class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;         // asignación directa
        this.direccion = direccion;   // asignación directa
    }

    // Getters / Setters
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "Editorial{nombre='" + nombre + "', direccion='" + direccion + "'}";
    }
}
