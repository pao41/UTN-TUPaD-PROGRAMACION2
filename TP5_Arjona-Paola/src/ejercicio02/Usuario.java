package ejercicio02;

public class Usuario {
    private String nombre;     // Nombre del usuario
    private String dni;        // DNI del usuario
    private Celular celular;   // Referencia al celular (bidireccional)

    // Constructor de Usuario
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Setter para asociar un celular al usuario
    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    // Getter para obtener el celular asociado
    public Celular getCelular() {
        return celular;
    }

    // Representación en texto del usuario
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
}