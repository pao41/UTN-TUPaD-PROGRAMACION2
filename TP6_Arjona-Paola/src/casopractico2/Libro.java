package casopractico2;

public class Libro {
    // Atributos
    private String isbn; // Identificador único del libro
    private String titulo; // Título del libro
    private int aniopublicacion; // Año de publicación
    private Autor autor; // Autor del libro - Asociación con la clase Autor
    
    // Constructor
    public Libro(String isbn, String titulo, int aniopublicacion, Autor autor) {
        // Validación de autor
        if (autor == null) {
            throw new IllegalArgumentException("El libro debe tener un autor designado");
        }
        this.isbn = isbn;
        this.titulo = titulo;
        this.aniopublicacion = aniopublicacion;
        this.autor = autor;
    }
    
    // Metodo
    public void  mostrarInfo(){
        System.out.println("ISBN: " + isbn + "| Titulo: " + titulo + "| Año de publicacion: " + aniopublicacion);
        autor.mostrarInfo();
    }
    // Getter
    public String getIsbn() {return isbn;}
    public String getTitulo() {return titulo;}
    public int getAniopublicacion() {return aniopublicacion;}
    public Autor getAutor() {return autor;}
    

}
