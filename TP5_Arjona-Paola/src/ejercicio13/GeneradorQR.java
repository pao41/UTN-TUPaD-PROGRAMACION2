package ejercicio13;
/**
 * Clase GeneradorQR
 * Relación: Dependencia de creación → crea CodigoQR en un método, pero no lo guarda como atributo.
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        // Se crea el objeto dentro del método
        CodigoQR qr = new CodigoQR(valor, usuario);

        // Se utiliza (por ejemplo, mostrar en consola)
        System.out.println("Código QR generado");
        System.out.println(qr);

    }

}
