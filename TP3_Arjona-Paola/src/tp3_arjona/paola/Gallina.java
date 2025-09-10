package tp3_arjona.paola;

// Se define la clase Gallina
public class Gallina {
    // Atributos
    int idGallina;
    int edad;
    int huevosPuestos;
    
    // Métodos
    public void ponerHuevo(){
        huevosPuestos += 1; // Incrementa en 1 la cantidad de huevos puestos
    }
     public void envejecer(){
        edad += 1; // Incrementa en 1 la edad de la gallina
    }
     public void mostrarEstado(){
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
