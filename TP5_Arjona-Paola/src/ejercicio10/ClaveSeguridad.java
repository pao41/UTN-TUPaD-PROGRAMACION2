package ejercicio10;
import java.time.LocalDate; 
/**
 * Clase ClaveSeguridad
 * Relación: Composición → existe solo dentro de CuentaBancaria.
 */
public class ClaveSeguridad {
    private String codigo;
    private LocalDate ultimaModificacion;

    // Constructor
    public ClaveSeguridad(String codigo, LocalDate ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public LocalDate getUltimaModificacion() { return ultimaModificacion; }
    public void setUltimaModificacion(LocalDate ultimaModificacion) { this.ultimaModificacion = ultimaModificacion; }

    @Override
    public String toString() {
        return "Clave de Seguridad{" +
                "codigo='" + codigo + '\'' +
                ", Ultima Modificacion=" + ultimaModificacion +
                '}';
    }

}
