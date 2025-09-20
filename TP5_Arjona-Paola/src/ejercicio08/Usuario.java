package ejercicio08;

public class Usuario {
    private String nombre;
    private String email;

    // Constructor con parámetros
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
    return "Usuario\n" +
           "  Nombre: " + nombre + "\n" +
           "  Email: " + email;
    }

}
