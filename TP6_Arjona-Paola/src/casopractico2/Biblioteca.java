package casopractico2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private final List<Libro> libros = new ArrayList(); // Composicion 1:N (Biblioteca y libros)
    
    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
// 1. agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor)
    // Método requerido para Composición: crea el objeto interno a partir de datos primitivos/objetos
    // Esto asegura que el Libro se "crea dentro" del contexto de la Biblioteca
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor) {
    // Validacion
    if (autor == null) {
        System.out.println("Error: No se puede agregar un libro sin autor");
        return;}
    // Nuevo libro: Crea una nueva instancia de Libro con los datos recibidos 
    Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
    libros.add(nuevoLibro); // Añade el objeto Libro recién creado a la lista: libros
    System.out.println("Libro agregado: " + titulo);
    }   
    
// 2. listarLibros()
    public void listarLibros(){
        if (libros.isEmpty()){
            System.out.println("La biblioteca no posee libros");
            return;}
        else {
            System.out.println("\nLibros en la Biblioteca: " + nombre);
        for (Libro libro : libros) { // Bucle for-each: recorre cada libro en la lista
            libro.mostrarInfo();     // Llama al metodo mostrarInfo() de cada libro
        }
        }
    }
    
// 3. buscarLibroPorIsbn(String isbn)
     public Libro buscarLibroPorIsbn(String isbn) {
        if (isbn == null || isbn.isEmpty()) return null;
        for (Libro libro : libros) {                // Compara el ISBN del libro con el ISBN buscado
            if (libro.getIsbn().equals(isbn)) {     
                return libro;                       // Si coincide, devuelve la instancia encontrada
            }
        }
        return null; // Devuelve null para indicar "no encontrado"
    }
    
// 4. eliminarLibro(String isbn)
    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);    // Reutiliza el método de búsqueda
        if (libroAEliminar != null) {                       // Si se encontró el libro (no es null)
            libros.remove(libroAEliminar);                  // Lo elimina de la lista
            System.out.println("Libro eliminado: " + libroAEliminar.getTitulo());
            return true;
        }
        System.out.println("Error: Libro con ISBN '" + isbn + "' no encontrado");
        return false;
    }
// 5. obtenerCantidadLibros()
    public int obtenerCantidadLibros() {
        return libros.size();           // Devuelve el numero de elementos en la lista
    }
    
// 6. filtrarLibrosPorAnio(int anio)
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> filtrados = new ArrayList<>();
        System.out.println("\n--- Libros publicados en el año: " + anio + " ---");
        for (Libro libro : libros) {
            if (libro.getAniopublicacion() == anio) {
                filtrados.add(libro);
                libro.mostrarInfo();
            }
        }
        if (filtrados.isEmpty()) {
            System.out.println("No se encontraron libros de ese año");
        }
        // Encapsulamiento
        return Collections.unmodifiableList(filtrados); 
    }

// 7. mostrarAutoresDisponibles()
    public void mostrarAutoresDisponibles() {
        System.out.println("\n--- Autores de los Libros Disponibles en la Biblioteca ---");
        List<String> autoresVistos = new ArrayList<>(); // Lista auxiliar para evitar duplicados
        for (Libro libro : libros) {                    // Recorre cada libro para obtener su autor
            String nombreAutor = libro.getAutor().getNombre();  // Obtiene el nombre del autor del libro
            
            // Verificacion (si el nombre del autor ya fue listado)
            if (!autoresVistos.contains(nombreAutor)) {
                System.out.println("- " + libro.getAutor().toString()); 
                autoresVistos.add(nombreAutor);    // Lo añade a la lista auxiliar para evitar repetición
            }
        }
        if (autoresVistos.isEmpty()) {
            System.out.println("No hay autores disponibles.");
        }
    }
}
