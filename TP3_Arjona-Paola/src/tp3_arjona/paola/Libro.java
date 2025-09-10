package tp3_arjona.paola;

// Se define la clase Libro
public class Libro {
    // Atributos privados (encapsulamiento)
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Getters requeridos
    public String getTitulo() { 
        return titulo; 
    }   
    public String getAutor() { 
        return autor; 
    }   
    public int getAnioPublicacion() { 
        return anioPublicacion; 
    }
    
    // Setter (con validacion para anioPublicacion)
    public void setAnioPublicacion(int anio){
        int anioActual = java.time.Year.now().getValue(); // Usa la clase de Java Year para obtener el año actual del sistema
        if (anio > 0 && anio <= anioActual) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Año inválido");
        }
    }
}
