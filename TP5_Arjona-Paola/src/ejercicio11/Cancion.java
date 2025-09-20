package ejercicio11;
/**
 * Clase Cancion
 * Relación: Asociación unidireccional con Artista.
 */
public class Cancion {
    private String titulo;
    private Artista artista; // unidireccional

    // Constructor
    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

     // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Artista getArtista() { return artista; }
    public void setArtista(Artista artista) { this.artista = artista; }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", artista=" + artista.getNombre() +
                '}';
    }

}
