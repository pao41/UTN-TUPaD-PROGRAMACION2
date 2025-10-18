package Ejercicio4;

public class Vaca extends Animal { // Se extiende de la clase Animal
    public Vaca(String nombre) {
        super(nombre);
    }

    // Sobrescritura
    @Override
    public void hacerSonido() {
        System.out.println("muuu");
    }

}
