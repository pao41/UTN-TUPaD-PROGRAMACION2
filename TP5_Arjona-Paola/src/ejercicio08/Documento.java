package ejercicio08;
/**
 * Clase Documento
 * Relación:
 * Composición con FirmaDigital (la firma se crea dentro del documento).
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición

    // Constructor
    public Documento(String titulo, String contenido, String codigoHash, java.time.LocalDate fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        // Composición: la firma digital se crea junto con el documento
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirma() { return firma; }

    @Override
    public String toString() {
    return "Documento\n" +
           "  Titulo: " + titulo + "\n" +
           "  Contenido: " + contenido + "\n" +
           "  " + firma;  
    }

}
