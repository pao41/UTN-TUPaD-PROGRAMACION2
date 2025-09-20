package ejercicio03;

public class Libro {
    // Atributos 
    private String titulo;
    private String isbn;

    // Relaciones 1 a 1
    private Autor autor;         // Libro → Autor (unidireccional)
    private Editorial editorial; // Libro → Editorial (agregación)

    // Constructor vacío 
    public Libro() { }

    // Constructor 
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    // Getters / Setters (encapsulamiento)
    public String getTitulo() { return titulo; }
    public String getIsbn()   { return isbn; }
    public Autor getAutor()   { return autor; }            // unidireccional
    public Editorial getEditorial() { return editorial; }  // agregación

    public void setTitulo(String titulo)       { this.titulo = titulo; }
    public void setIsbn(String isbn)           { this.isbn = isbn; }
    public void setAutor(Autor autor)          { this.autor = autor; }           // cambia autor
    public void setEditorial(Editorial editorial) { this.editorial = editorial; } // reemplaza editorial

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', isbn='" + isbn + "', autor=" +
               (autor != null ? autor.getNombre() : "null") +
               ", editorial=" + (editorial != null ? editorial.getNombre() : "null") + "}";
    }
}
