package tp3_arjona.paola;

// Se define la clase Mascota
public class Mascota {
    // Atributos
    String nombre;
    String especie;
    int edad;
    
    // Métodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
    
    public void cumplirAnios(){
        edad += 1;
    }

}
