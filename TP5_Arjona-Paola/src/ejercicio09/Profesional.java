package ejercicio09;
/**
 * Clase Profesional
 * Relación: Accedido unidireccionalmente desde CitaMédica.
 */
public class Profesional {
     private String nombre;
    private String especialidad;

    // Constructor
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    @Override
    public String toString() {
        return "Profesional {" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

}
