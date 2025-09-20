package ejercicio01;

import java.util.Objects;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // asociación bidireccional 1–1

    public Titular(String nombre, String dni) {
        this.nombre = Objects.requireNonNull(nombre, "nombre requerido");
        this.dni = Objects.requireNonNull(dni, "dni requerido");
    }

    public void setPasaporte(Pasaporte p) {
        if (this.pasaporte == p) return;
        this.pasaporte = p;
        if (p != null && p.getTitular() != this) {
            p.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() { return pasaporte; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    @Override
    public String toString() {
        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", pasaporte=" + (pasaporte != null ? pasaporte.getNumero() : "null") +
                '}';
    }
}