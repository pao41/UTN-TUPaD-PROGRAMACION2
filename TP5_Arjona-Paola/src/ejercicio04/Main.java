package ejercicio04;


public class Main {

    public static void main(String[] args) {
         Banco banco = new Banco("Banco Nación", "30-50000000-1");

        Cliente cliente = new Cliente();
        cliente.setNombre("Ana Gómez");
        cliente.setDni("40.123.456");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4509 1234 5678 9010", "08/27", banco);
        tarjeta.setCliente(cliente); 

        System.out.println("=== Estado inicial ===");
        System.out.println(tarjeta);
        System.out.println(cliente);

        // Reemplazar el banco
        tarjeta.setBanco(new Banco("Banco Galicia", "30-99999999-9"));
        System.out.println("\n=== Luego de cambiar el banco ===");
        System.out.println(tarjeta);
    }
}
