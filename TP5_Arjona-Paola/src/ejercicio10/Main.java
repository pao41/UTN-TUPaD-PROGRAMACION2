package ejercicio10;
import java.time.LocalDate; 

public class Main {

    public static void main(String[] args) {
        // Crear titular
        Titular t1 = new Titular("Ana Garcia", "40123456");

        // Crear cuenta bancaria con clave de seguridad (composición)
        CuentaBancaria cuenta1 = new CuentaBancaria("0001234500012345678901", 15000.50,
                                                   "CLV123", LocalDate.now());

        // Asociar cuenta y titular (bidireccional)
        cuenta1.setTitular(t1);

        // Mostrar información
        System.out.println("Cuenta bancaria: " + cuenta1.getCbu());
        System.out.println("Titular: " + t1.getNombre());
        System.out.println("Clave de seguridad: " + cuenta1.getClave().getCodigo());
    }
}
