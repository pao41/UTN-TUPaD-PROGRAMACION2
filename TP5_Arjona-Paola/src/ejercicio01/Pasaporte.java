package ejercicio01;

import java.time.LocalDate;
import java.util.Objects;

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;           
    private Titular titular;     // asociación bidireccional 1–1

    public Pasaporte(String numero, LocalDate fechaEmision, String imagen, String formato) {
        this.numero = Objects.requireNonNull(numero, "numero requerido");
        this.fechaEmision = Objects.requireNonNull(fechaEmision, "fechaEmision requerida");
        this.foto = new Foto(
            Objects.requireNonNull(imagen, "imagen requerida"),
            Objects.requireNonNull(formato, "formato requerido")
        );
    }

    public void setTitular(Titular t) {
        if (this.titular == t) return;
        this.titular = t;
        if (t != null && t.getPasaporte() != this) {
            t.setPasaporte(this);
        }
    }

    public Titular getTitular() { return titular; }
    public String getNumero() { return numero; }
    public LocalDate getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", fechaEmision=" + fechaEmision +
                ", foto=" + foto +
                ", titular=" + (titular != null ? titular.getNombre() + " (" + titular.getDni() + ")" : "null") +
                '}';
    }
}