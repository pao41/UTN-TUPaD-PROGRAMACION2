package ejercicio13;

public class Main {

    public static void main(String[] args) {
         // Crear usuario
        Usuario u1 = new Usuario("Ana Casas", "ana.casas@email.com");

        // Crear generador de QR
        GeneradorQR generador = new GeneradorQR();

        // Usar dependencia de creación: generar un código QR
        generador.generar("QR12345XYZ", u1);
    }
}
