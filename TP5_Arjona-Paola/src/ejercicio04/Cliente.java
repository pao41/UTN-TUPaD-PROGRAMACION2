package ejercicio04;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // 1–1 bidireccional

    public Cliente() { } 
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Asociación 1–1 bidireccional
    public void setTarjeta(TarjetaDeCredito t) {
        if (this.tarjeta == t) return;           

        TarjetaDeCredito anterior = this.tarjeta;
        this.tarjeta = t;

        if (anterior != null && anterior.getCliente() == this) {
            anterior.setCliente(null);
        }

        if (t != null && t.getCliente() != this) {
            t.setCliente(this);
        }
    }

    public String getNombre() { return nombre; }
    public String getDni()    { return dni; }
    public TarjetaDeCredito getTarjeta() { return tarjeta; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDni(String dni)       { this.dni = dni; }

    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', dni='" + dni + "', tarjeta=" +
                (tarjeta != null ? tarjeta.getNumero() : "null") + "}";
    }

}
