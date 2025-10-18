package Ejercicio4;

public class Gato extends Animal { // Se extiende de la clase Animal
    public Gato(String nombre) {
        super(nombre);
    }

    // Sobrescritura
    @Override
    public void hacerSonido() {
        System.out.println("miau miau");
    }

}
