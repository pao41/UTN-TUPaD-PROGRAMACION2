package ejercicio14;
/**
 * Clase Render
 * Relación: Asociación unidireccional con Proyecto.
 */
public class Render {
     private String formato;
    private Proyecto proyecto; // unidireccional

    // Constructor
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
    // Getters y Setters
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    public Proyecto getProyecto() { return proyecto; }
    public void setProyecto(Proyecto proyecto) { this.proyecto = proyecto; }
    
    @Override
    public String toString() {
        return "Render{" +
                "formato='" + formato + '\'' +
                ", proyecto=" + proyecto.getNombre() +
                '}';
    }

}
