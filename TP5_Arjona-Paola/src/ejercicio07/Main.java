package ejercicio07;


public class Main {

    public static void main(String[] args) {
        // Crear motor
        Motor m1 = new Motor("Nafta", "MTR12345");

        // Crear vehículo con motor (agregación)
        Vehiculo v1 = new Vehiculo("AB123CD", "Toyota Corolla", m1);

        Conductor c1 = new Conductor("Luis Paz", "LIC98765");

        // Asociar conductor y vehículo (bidireccional)
        v1.setConductor(c1);

        // Mostrar información
        System.out.println(v1);   // Vehículo completo con motor y conductor
        System.out.println(c1);   // Conductor
        System.out.println(m1);   // Motor
    }
}
