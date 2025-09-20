package ejercicio06;

public class Main {

    public static void main(String[] args) {
        // Crear cliente
        Cliente c1 = new Cliente("Maria Lopez", "381234567");

        // Crear mesa (existe independientemente)
        Mesa m1 = new Mesa(5, 4);

        // Crear reserva
        Reserva r1 = new Reserva("20/09/2025", "21:30", c1, m1);

        // Mostrar datos
        System.out.println(r1);
        System.out.println("Cliente de la reserva: " + r1.getCliente().getNombre());
        System.out.println("Mesa reservada: " + r1.getMesa().getNumero());
    }
}
