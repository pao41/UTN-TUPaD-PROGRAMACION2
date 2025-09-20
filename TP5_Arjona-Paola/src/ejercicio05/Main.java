package ejercicio05;

public class Main {

    public static void main(String[] args) {
        // Crear propietario
        Propietario p1 = new Propietario("Juan Pérez", "40123456");

        // Crear computadora con su placa madre (composición)
        Computadora c1 = new Computadora("Lenovo", "SN12345", "B450M", "AMD");

        // Establecer relación bidireccional entre propietario y computadora
        c1.setPropietario(p1);

        // Mostrar datos
        System.out.println(c1); // imprime computadora, propietario y placa madre
        System.out.println(p1); // imprime propietario
        System.out.println(c1.getPlacaMadre()); // imprime placa madre
    }
}
