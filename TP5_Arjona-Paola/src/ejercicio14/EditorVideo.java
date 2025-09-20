package ejercicio14;
/**
 * Clase EditorVideo
 * Relación: Dependencia de creación → crea Render en un método, pero no lo guarda como atributo.
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        // Se crea el objeto Render dentro del método
        Render render = new Render(formato, proyecto);

        // Mostrar
        System.out.println("Exportando proyecto: " + proyecto.getNombre() + " en formato " + formato);

    }

}
