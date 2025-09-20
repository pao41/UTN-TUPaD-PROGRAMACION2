package ejercicio14;

public class Proyecto {
    private String nombre;
    private int duracionMin;

    // Constructor
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getDuracionMin() { return duracionMin; }
    public void setDuracionMin(int duracionMin) { this.duracionMin = duracionMin; }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", duracionMin=" + duracionMin +
                " min}";
    }

}
