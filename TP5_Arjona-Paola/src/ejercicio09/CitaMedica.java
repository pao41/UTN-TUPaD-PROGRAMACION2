package ejercicio09;
/**
 * Clase CitaMédica
 * Relación:
 * - Asociación unidireccional con Paciente.
 * - Asociación unidireccional con Profesional.
 */
public class CitaMedica {
      private String fecha;
    private String hora;
    private Paciente paciente;         // Asociación unidireccional
    private Profesional profesional;   // Asociación unidireccional

    // Constructor
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    // Getters y Setters
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public Profesional getProfesional() { return profesional; }
    public void setProfesional(Profesional profesional) { this.profesional = profesional; }

    @Override
    public String toString() {
        return "Cita Medica {" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", paciente=" + paciente.getNombre() +
                ", profesional=" + profesional.getNombre() +
                '}';
    }

}
