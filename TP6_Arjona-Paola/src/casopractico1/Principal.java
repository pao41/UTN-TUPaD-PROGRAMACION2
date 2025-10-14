package casopractico1;

public class Principal {

    public static void main(String[] args) {
        // Se crea una instancia de Inventario con nombre descriptivo
         Inventario tienda = new Inventario("Tienda Online");

        // 1. Crear y agregar productos
        System.out.println("--- Creacion y Agregado de productos ---");
        Producto leche = new Producto("A001", "Leche Entera", 1500.0, 25, CategoriaProducto.ALIMENTOS);
        Producto tablet = new Producto("E002", "Tablet", 250000.0, 5, CategoriaProducto.ELECTRONICA);
        Producto jean = new Producto("R003", "Jean", 25000.0, 30, CategoriaProducto.ROPA);
        Producto mesa = new Producto("H004", "Mesa de luz", 38000.0, 8, CategoriaProducto.HOGAR);
        Producto cereal = new Producto("A005", "Arroz", 1800.0, 20, CategoriaProducto.ALIMENTOS);
        
        tienda.agregarProducto(leche);
        tienda.agregarProducto(tablet);
        tienda.agregarProducto(jean);
        tienda.agregarProducto(mesa);
        tienda.agregarProducto(cereal);
        
        System.out.println("-----------------------------------------------------------------");
        
        // 2. Listar todos los productos
        System.out.println("\n--- Listar todos los Productos ---");
        tienda.listarProductos();
        System.out.println("-----------------------------------------------------------------");
        
        // 3. Buscar un producto por ID y mostrar su información
        System.out.println("\n--- Buscar Producto por ID (R003) ---");
        Producto productoBuscado = tienda.buscarProductoPorId("R003");
        if (productoBuscado != null) {
            System.out.println("Producto encontrado: " + productoBuscado);
        } else {
            System.out.println("Producto R003 no encontrado");
        }
        System.out.println("-----------------------------------------------------------------");
        
        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica (ALIMENTOS)
        System.out.println("\n--- Filtrar por Categoria ---");
        tienda.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        System.out.println("-----------------------------------------------------------------");
        
        // 5. Eliminar un producto por su ID y listar los productos restantes
        System.out.println("\n--- Eliminar Producto por ID (H004) ---");
        tienda.eliminarProducto("H004");
        System.out.println("\n--- Listado despues de eliminar ---");
        tienda.listarProductos();
        System.out.println("-----------------------------------------------------------------");
        
        // 6. Actualizar el stock de un producto existente (A001)
        System.out.println("\n--- Actualizar Stock (A001) ---");
        tienda.actualizarStock("A001", 65);
        System.out.println("-----------------------------------------------------------------");

        // 7. Mostrar el total de stock disponible
        System.out.println("\n--- Mostrar Total de Stock ---");
        System.out.println("Stock Total en Inventario: " + tienda.obtenerTotalStock()+ " articulos");
        System.out.println("-----------------------------------------------------------------");

        // 8. Obtener y mostrar el producto con mayor stock
        System.out.println("\n--- Producto con Mayor Stock ---");
        Producto mayorStock = tienda.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock: " + mayorStock);
        }
        System.out.println("-----------------------------------------------------------------");

        // 9. Filtrar productos con precios entre $1000 y $3000
        System.out.println("\n--- Filtrar Productos por Precio ($1000 - $3000) ---");
        tienda.filtrarProductosPorPrecio(1000.0, 3000.0);
        System.out.println("-----------------------------------------------------------------");

        // 10. Mostrar las categorías disponibles con sus descripciones
        System.out.println("\n--- Mostrar Categorias Disponibles ---");
        tienda.mostrarCategoriasDisponibles();
    }       
                
}
