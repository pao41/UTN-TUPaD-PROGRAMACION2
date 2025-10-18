package Ejercicio4;

public class Perro extends Animal { // Se extiende de la clase Animal
    
    public Perro(String nombre) {
        super(nombre);
    }

    // Sobrescritura
    @Override
    public void hacerSonido() {
        System.out.println("guau guau");
    }

}
