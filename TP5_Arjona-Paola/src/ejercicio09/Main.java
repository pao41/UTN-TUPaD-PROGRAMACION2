package ejercicio09;


public class Main {

    public static void main(String[] args) {
        // Crear paciente
        Paciente p1 = new Paciente("Juan Paz", "OSDE");

        // Crear profesional
        Profesional prof1 = new Profesional("Dra. Rodriguez", "Cardiologia");

        // Crear cita médica
        CitaMedica cita1 = new CitaMedica("22/09/2025", "15:30", p1, prof1);

        // Mostrar información
        System.out.println("Paciente: " + p1.getNombre());
        System.out.println("Profesional: " + prof1.getNombre());
        System.out.println(cita1);
    }

}
