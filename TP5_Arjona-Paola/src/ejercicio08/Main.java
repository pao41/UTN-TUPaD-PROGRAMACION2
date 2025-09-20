package ejercicio08;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Crear usuario
        Usuario u1 = new Usuario("Ana Martinez", "ana.martinez@email.com");

        // Crear documento con su firma digital (composición)
        Documento d1 = new Documento(
                "Contrato de Servicio",
                "Contenido del contrato...",
                "HASH12345",
                LocalDate.now(), // fecha actual
                u1 // usuario que firma
        );

        // Mostrar información
        System.out.println(d1);  // Documento completo con firma
    }
}
