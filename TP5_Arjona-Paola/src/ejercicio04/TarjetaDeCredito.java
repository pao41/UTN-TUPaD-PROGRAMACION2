package ejercicio04;

public class TarjetaDeCredito {
    private String numero;             
    private String fechaVencimiento;   
    private Cliente cliente;           // asociación 1–1 (bidi)
    private Banco banco;               // agregación (inyectado)

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;            // puede ser null si aún no se conoce
    }

    /** Asociación 1–1 bidireccional */
    public void setCliente(Cliente c) {
        if (this.cliente == c) return;

        Cliente anterior = this.cliente;
        this.cliente = c;

        if (anterior != null && anterior.getTarjeta() == this) {
            anterior.setTarjeta(null);           // cortar vínculo previo
        }
        if (c != null && c.getTarjeta() != this) {
            c.setTarjeta(this);                  // sincronizar vínculo nuevo
        }
    }

    /** Agregación */
    public void setBanco(Banco banco) { this.banco = banco; }

    // Encapsulamiento
    public String getNumero()           { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Cliente getCliente()         { return cliente; }
    public Banco getBanco()             { return banco; }

    public void setNumero(String numero)                     { this.numero = numero; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    @Override
    public String toString() {
        return "TarjetaDeCredito{numero='" + numero + "', venc='" + fechaVencimiento +
                "', cliente=" + (cliente != null ? cliente.getNombre() : "null") +
                ", banco=" + (banco != null ? banco.getNombre() : "null") + "}";
    }

}
