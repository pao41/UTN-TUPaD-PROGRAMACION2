package casopractico2;

public class Principal {

    public static void main(String[] args) {
        // 1. Creamos una biblioteca
        Biblioteca bibliotecaProvincial = new Biblioteca("Biblioteca Provincial");
        System.out.println("Biblioteca creada");
        System.out.println("-----------------------------------------------------------------");
        
        // 2. Crear autores
        System.out.println("\n--- Creacion de Autores ---");
        Autor mariap = new Autor("A101", "Jorge Luis Borges", "Argentina");
        Autor gabim = new Autor("A102", "Gabriel Garcia Marquez", "Colombia");
        Autor pauloc = new Autor("A103", "Paulo Coelho", "Brasil");
        
        mariap.mostrarInfo();
        gabim.mostrarInfo();
        pauloc.mostrarInfo();
        System.out.println("-----------------------------------------------------------------");

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca
        System.out.println("\n--- Agregado de Libros ---");
        bibliotecaProvincial.agregarLibro("L001", "Cien Años de Soledad", 1967, gabim);
        bibliotecaProvincial.agregarLibro("L002", "El Anillo", 1949, mariap);
        bibliotecaProvincial.agregarLibro("L003", "Mascotas", 1944, mariap);
        bibliotecaProvincial.agregarLibro("L004", "El Alquimista", 1982, pauloc);
        bibliotecaProvincial.agregarLibro("L005", "El Amor en Tiempos del Colera", 1985, gabim);
        System.out.println("-----------------------------------------------------------------");

        // 4. Listar todos los libros
        bibliotecaProvincial.listarLibros();
        System.out.println("-----------------------------------------------------------------");

        // 5. Buscar un libro por su ISBN y mostrar su información
        System.out.println("\n--- Buscar Libro por ISBN (L004) ---");
        Libro libroBuscado = bibliotecaProvincial.buscarLibroPorIsbn("L004");
        if (libroBuscado != null) {
            System.out.println("Libro encontrado:");
            libroBuscado.mostrarInfo();
        }
        System.out.println("-----------------------------------------------------------------");

        // 6. Filtrar y mostrar los libros publicados en un año específico
        bibliotecaProvincial.filtrarLibrosPorAnio(1967);
        bibliotecaProvincial.filtrarLibrosPorAnio(1949);
        System.out.println("-----------------------------------------------------------------");

        // 7. Eliminar un libro por su ISBN y listar los libros restantes
        System.out.println("\n--- Eliminar Libro por ISBN (L003) ---");
        bibliotecaProvincial.eliminarLibro("L003");
        
        System.out.println("\n--- Listado despues de eliminar ---");
        bibliotecaProvincial.listarLibros();

        System.out.println("-----------------------------------------------------------------");

        // 8. Mostrar la cantidad total de libros en la biblioteca
        System.out.println("\n--- Cantidad Total de Libros ---");
        System.out.println("Total de libros en stock: " + bibliotecaProvincial.obtenerCantidadLibros());
        System.out.println("-----------------------------------------------------------------");

        // 9. Listar todos los autores de los libros disponibles en la biblioteca
        bibliotecaProvincial.mostrarAutoresDisponibles();
    }
}

