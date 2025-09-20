package ejercicio12;
/**
 * Clase Calculadora
 * Relación: Dependencia de uso → usa Impuesto como parámetro en un método, pero no lo guarda como atributo.
 */
public class Calculadora {
     // Método dependiente de uso
    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        Contribuyente c = impuesto.getContribuyente();

        // Ejemplo: aplicar un 21% de IVA
        double total = monto * 1.21;

        System.out.println("Calculo de impuesto para " + c.getNombre() +
                " (CUIL: " + c.getCuil() + ")");
        System.out.println("Monto original: $" + monto);
        System.out.println("Monto con IVA (21%): $" + total);
    }

}
