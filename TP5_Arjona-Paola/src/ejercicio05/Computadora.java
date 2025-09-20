package ejercicio05;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Composición
    private Propietario propietario; // Asociación bidireccional

    // Constructor
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset); // composición fuerte
    }

    // Getters y setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }

    public PlacaMadre getPlacaMadre() { return placaMadre; }

    public Propietario getPropietario() { return propietario; }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        propietario.setComputadora(this); // bidireccionalidad 
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + 
               ", " + placaMadre + ", propietario=" + propietario.getNombre() + '}';
    }

}
