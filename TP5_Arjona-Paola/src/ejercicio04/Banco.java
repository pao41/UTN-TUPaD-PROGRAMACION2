package ejercicio04;

public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    // getters/setters
    public String getNombre() { return nombre; }
    public String getCuit()   { return cuit; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCuit(String cuit)     { this.cuit = cuit; }

    @Override
    public String toString() {
        return "Banco{nombre='" + nombre + "', cuit='" + cuit + "'}";
    }

}
