package ejercicio10;
import java.time.LocalDate; 
/**
 * Clase CuentaBancaria
 * Relación:
 * - Composición con ClaveSeguridad.
 * - Asociación bidireccional con Titular.
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;  // Composición
    private Titular titular;       // Asociación bidireccional

    // Constructor
    public CuentaBancaria(String cbu, double saldo, String codigoClave, LocalDate ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, ultimaModificacion);
    }

    // Getters y Setters
    public String getCbu() { return cbu; }
    public void setCbu(String cbu) { this.cbu = cbu; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public ClaveSeguridad getClave() { return clave; }

    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setCuenta(this); // asegura bidireccionalidad
    }

    @Override
    public String toString() {
        String nombreTitular = (titular != null) ? titular.getNombre() : "Sin titular";
        return "Cuenta Bancaria{" +
                "cbu='" + cbu + '\'' +
                ", saldo=" + saldo +
                ", " + clave +
                ", titular=" + nombreTitular +
                '}';
    }

}
