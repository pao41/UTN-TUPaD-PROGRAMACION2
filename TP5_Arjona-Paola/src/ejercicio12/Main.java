package ejercicio12;


public class Main {

    public static void main(String[] args) {
         // Crear contribuyente
        Contribuyente contrib1 = new Contribuyente("Maria Casas", "27-40123456-9");

        // Crear impuesto asociado al contribuyente
        Impuesto imp1 = new Impuesto(10000, contrib1);

        // Crear calculadora
        Calculadora calc = new Calculadora();

        // Usar dependencia de uso: calcular sobre el impuesto
        calc.calcular(imp1);
    }
}
