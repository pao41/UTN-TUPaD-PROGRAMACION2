package ejercicio03;

public class Autor {
    private String nombre;
    private String nacionalidad;

    // Constructor vacío
    public Autor() { }

    // Constructor con parámetros
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getters / Setters
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    @Override
    public String toString() {
        return "Autor{nombre='" + nombre + "', nacionalidad='" + nacionalidad + "'}";
    }
}
