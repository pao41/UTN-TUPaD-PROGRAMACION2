package Ejercicio1;
// Subclase
public class Auto extends Vehiculo { // Se extiende de la clase Vehiculo 
    private int cantidadPuertas; // Atributo específico de Auto

    // Constructor
    // Llama a super(marca, modelo) para inicializar los atributos heredados
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // Llamada al constructor de la superclase
        this.cantidadPuertas = cantidadPuertas;
    }

    // Sobrescritura del método mostrarInfo()
    @Override
    public void mostrarInfo() {
        System.out.println("Auto: " + this.marca + " " + this.modelo);
        System.out.println("Cantidad de Puertas: " + cantidadPuertas);
    }

}
