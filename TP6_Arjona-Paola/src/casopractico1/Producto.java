package casopractico1;

public class Producto {
     // Atributos de la clase (encapsulados)
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria; // Uso de enum

    // Constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public CategoriaProducto getCategoria() { return categoria; }

    // Setter para actualizar el stock
    public void setCantidad(int cantidad) {
        if (cantidad >= 0) { // Validación
            this.cantidad = cantidad;
        } else {
            System.out.println("Error: La cantidad no puede ser negativa");
        }
    }
    // Método para mostrar la información del producto
    public void mostrarInfo() {
        System.out.println("------------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + cantidad);
        System.out.println("Categoria: " + categoria.name() + " (" + categoria.getDescripcion() + ")");
    }
    @Override
    public String toString() {
        return String.format("ID: %s | Nombre: %s | Precio: $%.2f | Stock: %d | Categoria: %s (%s)",
                             id, nombre, precio, cantidad, categoria.name(), categoria.getDescripcion());
    }
}
