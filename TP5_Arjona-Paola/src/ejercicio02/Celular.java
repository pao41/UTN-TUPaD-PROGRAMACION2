package ejercicio02;

public class Celular {
    private String imei;       // IMEI del celular
    private String marca;      // Marca del celular
    private String modelo;     // Modelo del celular
    private Bateria bateria;   // Relación de agregación con Bateria
    private Usuario usuario;   // Asociación bidireccional con Usuario

    // Constructor de Celular
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;

        // Establecer la relación bidireccional
        usuario.setCelular(this);
    }

    // Getters y Setters
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        usuario.setCelular(this); // mantener bidireccionalidad
    }

    // Representación en texto del celular
    @Override
    public String toString() {
        return "Celular{" +
                "imei=" + imei +
                ", marca=" + marca +
                ", modelo=" + modelo +
                ", bateria=" + bateria +
                ", usuario=" + usuario +
                '}';
    }
    
    
}