package ejercicio11;


public class Main {

    public static void main(String[] args) {
        // Crear artista
        Artista a1 = new Artista("Enrique Iglesias", "Pop");

        // Crear canción asociada al artista
        Cancion c1 = new Cancion("Heroe", a1);

        // Crear reproductor
        Reproductor r1 = new Reproductor();

        // Usar dependencia de uso: reproducir la canción
        r1.reproducir(c1);
    }

}
