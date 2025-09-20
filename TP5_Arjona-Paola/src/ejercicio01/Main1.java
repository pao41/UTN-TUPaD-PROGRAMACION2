package ejercicio01;

import java.time.LocalDate;

public class Main1 {
    public static void main(String[] args) {
        // Crear un titular
        Titular titular = new Titular("Ana Casas", "12345678");

        // Crear un pasaporte asociado a ese titular
        Pasaporte pasaporte = new Pasaporte(
                "A12345",                        // número
                LocalDate.of(2025, 1, 10),       // fecha de emisión
                "imagen01",                      // nombre/identificador de la imagen
                "jpg"                            // formato de la imagen
        );

        // Establecer la relación bidireccional
        titular.setPasaporte(pasaporte);

        // Mostrar resultados en consola
        System.out.println(titular);
        System.out.println(pasaporte);

        // Acceso a la foto desde el pasaporte
        System.out.println("Formato de la foto: " + pasaporte.getFoto().getFormato());
    }
}