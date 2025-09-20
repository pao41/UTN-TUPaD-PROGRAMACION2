package ejercicio07;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;         // Agregación
    private Conductor conductor; // Asociación bidireccional

    // Constructor vacío
    public Vehiculo() {}

    // Constructor con parámetros 
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    // Getters y Setters
    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }

    public Conductor getConductor() { return conductor; }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        conductor.setVehiculo(this); // asegura bidireccionalidad
    }

    @Override
    public String toString() {
        String nombreConductor = (conductor != null) ? conductor.getNombre() : "Sin asignar";
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo +
                ", " + motor + ", conductor=" + nombreConductor + '}';
    }

}
