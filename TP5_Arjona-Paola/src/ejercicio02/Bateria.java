package ejercicio02;

public class Bateria {
    private String modelo;   // Modelo de la batería
    private int capacidad;   // Capacidad en mAh

    // Constructor de la clase
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Representación en texto de la batería
    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + "mAh}";
    }
}