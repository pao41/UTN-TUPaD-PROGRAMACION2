package casopractico1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventario {
    // Nombre descriptivo del inventario
    private String nombre;
    // Colección que contiene los productos e inicialización
    private List<Producto> productos = new ArrayList<>(); 
    // Constructor
    public Inventario(String nombre) {
        this.nombre = nombre;
    }

    // 1. Agregar Producto al inventario
    public void agregarProducto(Producto p) {
        // Validación
        if (p == null) {
            System.out.println("Error: El producto a agregar no puede ser nulo");
            return; 
        }
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }

    // 2. Listar Productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario esta vacio");
            return;
        }
        for (Producto p : productos) { // Uso de for-each
            System.out.println(p);
        }
    }
    
    // Devuelve una vista inmutable de la lista de productos
    public List<Producto> getProductos() {
        return Collections.unmodifiableList(productos); 
    }

    // 3. Buscar Producto por ID
    public Producto buscarProductoPorId(String id) {
        if (id == null || id.isEmpty()) return null;
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null; 
    }

    // 4. Eliminar Producto por ID
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto eliminado: " + p.getNombre());
            return true;
        }
        System.out.println("Error: Producto con ID '" + id + "' no encontrado");
        return false;
    }

    // 5. Actualizar Stock
    public boolean actualizarStock(String id, int nuevaCantidad) {
    Producto p = buscarProductoPorId(id);
    if (p == null) {
        System.out.println("Error: Producto con ID '" + id + "' no encontrado para ajustar stock");
        return false;
    }
    int stockActual = p.getCantidad();
    int nuevoStock = stockActual + nuevaCantidad;

    // Validación
    if (nuevoStock < 0) {
        System.out.println("Error: No se puede realizar el movimiento. El stock no puede ser negativo");
        return false;
    }
    // Aplicación del cambio en el objeto producto
    p.setCantidad(nuevoStock);

    // Determina la operación para el mensaje (incremento/egreso/sin cambios)
    String operacion = (nuevaCantidad > 0) ? "Incremento" 
                      : (nuevaCantidad < 0 ? "Egreso" : "Sin cambios");
    // Muestra stock anterior, movimiento aplicado y stock resultante
    System.out.println("Stock ajustado (" + operacion + ") para " + p.getNombre()
        + ". Stock Anterior: " + stockActual
        + ", Movimiento: " + nuevaCantidad
        + ", Stock Actualizado: " + nuevoStock);
    return true;
}    
    // 6. Filtrar por Categoría
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> filtrados = new ArrayList<>();
        System.out.println("--- Productos en la categoria: " + categoria.name() + " ---");
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
                System.out.println(p);
            }
        }
        if (filtrados.isEmpty()) {
             System.out.println("No hay productos en esta categoria");
        }
        return Collections.unmodifiableList(filtrados); // Devolvemos copia inmutable
    }

    // 7. Obtener Total Stock
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // 8. Obtener Producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;

        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    // 9. Filtrar Productos Por Precio
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> filtrados = new ArrayList<>();
        System.out.println("--- Productos con precios entre $" + min + " y $" + max + " ---");
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
                System.out.println(p);
            }
        }
        if (filtrados.isEmpty()) {
             System.out.println("No se encontraron productos en ese rango de precios");
        }
        return Collections.unmodifiableList(filtrados);
    }

    // 10. Mostrar Categorías Disponibles
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("-> " + cat.name() + ": " + cat.getDescripcion());
        }
    }
}
