package ejercicio13;
/**
 * Clase Usuario
 * Representa a la persona asociada a un código QR.
 */
public class Usuario {
    private String nombre;
    private String email;

    // Constructor
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
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
