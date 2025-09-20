package ejercicio14;

public class Main {

    public static void main(String[] args) {
        // Crear proyecto
        Proyecto p1 = new Proyecto("Documental", 90);

        // Crear editor de video
        EditorVideo editor = new EditorVideo();

        // Usar dependencia de creación: exportar en distintos formatos
        editor.exportar("MP4", p1);
        editor.exportar("AVI", p1);
    }
}
