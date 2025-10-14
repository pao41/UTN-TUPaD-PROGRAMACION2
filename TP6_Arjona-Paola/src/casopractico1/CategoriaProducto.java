package casopractico1;

public enum CategoriaProducto {
    // Valores
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electronicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Articulos para el hogar");
     // Atributo
    private final String descripcion;    
    // Constructor
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }
    // Getter
    public String getDescripcion() {
        return descripcion;
    }

}
