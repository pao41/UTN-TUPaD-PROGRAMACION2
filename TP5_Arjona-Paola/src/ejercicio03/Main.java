package ejercicio03;

public class Main {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNombre("Gabriel García Márquez");
        autor.setNacionalidad("Colombia");

        // Editorial: se crea con su constructor con parámetros
                Editorial editorial = new Editorial(
                "Alfaguara",
                "Av. Santa Fe 123, CABA"
        );

        // Constructor vacío
        Libro libro = new Libro();
        libro.setTitulo("Cien años de soledad");       // Setter para título 
        libro.setIsbn("978-84-376-0494-7");            // Setter para ISBN
        libro.setAutor(autor);                         // ASOCIACIÓN UNIDIRECCIONAL: Libro → Autor
        libro.setEditorial(editorial);                 // AGREGACIÓN: Libro → Editorial

        // Resultados
        System.out.println(libro);
    }
}
