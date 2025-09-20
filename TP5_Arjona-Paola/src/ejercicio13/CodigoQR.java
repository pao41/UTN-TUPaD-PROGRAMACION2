package ejercicio13;
/**
 * Clase CodigoQR
 * Relación: Asociación unidireccional con Usuario.
 */
public class CodigoQR {
     private String valor;
    private Usuario usuario; // unidireccional

    // Constructor
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    // Getters y Setters
    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    
    @Override
    public String toString() {
        return "CodigoQR {" +
                "valor='" + valor + '\'' +
                ", usuario=" + usuario.getNombre() +
                '}';
    }

}
