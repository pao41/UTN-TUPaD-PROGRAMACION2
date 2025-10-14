package casopractico2;

public class Autor {
    // Atributos
    private String id; // Identidicador unico del autor
    private String nombre;
    private String nacionalidad; // Nacionalidad del autor
    
    // Constructor 
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    // Metodo mostrarInfo
    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " | ID: " + id + " | Nacionalidad: " + nacionalidad);
    }
    // Getter
    public String getId() { return id;}
    public String getNombre() {return nombre;}
    public String getNacionalidad() {return nacionalidad;}

    @Override
    public String toString() {
        return String.format("Autor: %s | ID: %s | Nacionalidad: %s", 
                                nombre, id, nacionalidad); 
}
}
