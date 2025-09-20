package ejercicio11;
/**
 * Clase Reproductor
 * Relación: Dependencia de uso → usa Cancion como parámetro, pero no la guarda como atributo.
 */
public class Reproductor {
     // Método dependiente de uso
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() +
                " - " + cancion.getArtista().getNombre());
    }

}
