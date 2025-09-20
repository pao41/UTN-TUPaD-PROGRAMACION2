package ejercicio08;
import java.time.LocalDate; 
/**
 * Clase FirmaDigital
 * Relación:
 * - Composición: pertenece a un Documento.
 * - Agregación: se asocia a un Usuario.
 */
public class FirmaDigital {
    private String codigoHash;
    private LocalDate fecha;
    private Usuario usuario; // Agregación

    // Constructor
    public FirmaDigital(String codigoHash, LocalDate fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    // Getters y Setters
    public String getCodigoHash() { return codigoHash; }
    public void setCodigoHash(String codigoHash) { this.codigoHash = codigoHash; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
  
    @Override
    public String toString() {
    return "FirmaDigital\n" +
           "  Codigo Hash: " + codigoHash + "\n" +
           "  Fecha: " + fecha + "\n" +
           "  Usuario: " + usuario.getNombre() + " (" + usuario.getEmail() + ")";
    }

}
