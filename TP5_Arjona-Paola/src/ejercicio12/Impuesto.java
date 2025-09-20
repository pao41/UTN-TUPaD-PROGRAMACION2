package ejercicio12;
/**
 * Clase Impuesto
 * Relación: Asociación unidireccional con Contribuyente.
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // unidireccional

    // Constructor
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

     // Getters y Setters
    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public Contribuyente getContribuyente() { return contribuyente; }
    public void setContribuyente(Contribuyente contribuyente) { this.contribuyente = contribuyente; }

    @Override
    public String toString() {
        return "Impuesto{" +
                "monto=" + monto +
                ", contribuyente=" + contribuyente.getNombre() +
                '}';
    }

}
