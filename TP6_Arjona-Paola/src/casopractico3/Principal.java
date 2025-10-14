package casopractico3;

public class Principal {

    public static void main(String[] args) {
        Universidad utn = new Universidad("UTN");
        System.out.println("Universidad: UTN");
        
        // 1. Crear al menos 3 profesores y 5 cursos
        Profesor ana = new Profesor("P101", "Ana Hernandez", "Algoritmos");
        Profesor juan = new Profesor("P102", "Juan Soto", "Base de Datos");
        Profesor blanca = new Profesor("P103", "Blanca Perez", "Matematica");
        
        Curso c1 = new Curso("C001", "Programacion I");
        Curso c2 = new Curso("C002", "Programacion II");
        Curso c3 = new Curso("C003", "Bases de Datos I");
        Curso c4 = new Curso("C004", "Ingles");
        Curso c5 = new Curso("C005", "Probabilidad y Estadistica");
        System.out.println("-----------------------------------------------------------------");

        // 2. Agregar profesores y cursos a la universidad
        System.out.println("\n--- Agregado de Profesores y Cursos ---");
        System.out.println("Profesores");
        utn.agregarProfesor(ana); 
        utn.agregarProfesor(juan); 
        utn.agregarProfesor(blanca);
        System.out.println("Cursos");
        utn.agregarCurso(c1); 
        utn.agregarCurso(c2); 
        utn.agregarCurso(c3); 
        utn.agregarCurso(c4); 
        utn.agregarCurso(c5);
        System.out.println("-----------------------------------------------------------------");
        
        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...)
        System.out.println("\n--- Asignacion de Profesores a Cursos (Sincronización Bidireccional) ---");
        utn.asignarProfesorACurso("C001", "P101"); // Ana -> C001
        utn.asignarProfesorACurso("C002", "P101"); // Ana -> C002
        utn.asignarProfesorACurso("C003", "P102"); // Juan -> C003
        utn.asignarProfesorACurso("C004", "P102"); // Juan -> C004
        utn.asignarProfesorACurso("C005", "P103"); // Blanca -> C005 (Unidireccional por setter de Curso)
        System.out.println("-----------------------------------------------------------------");

        // 4. Listar cursos con su profesor y profesores con sus cursos
        System.out.println("\n--- Listado: cursos con su profesor y profesores con sus cursos ---");
        c1.mostrarInfo(); // Verifica el lado 'N'
        c3.mostrarInfo();
        c5.mostrarInfo();
        
        ana.listarCursos(); // Verifica el lado '1'
        juan.listarCursos();
        blanca.listarCursos();
        System.out.println("-----------------------------------------------------------------");
        
        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados
        System.out.println("\n--- Cambio de Profesor (Verificacion de Invariante) ---");
        utn.asignarProfesorACurso("C001", "P103"); // Ana (C001) -> Blanca(C001)
        
        System.out.println("\nResultado del Cambio (C001):");
        c1.mostrarInfo(); 
        ana.listarCursos(); // Ana debe tener 1 curso menos (solo C002)
        blanca.listarCursos(); // Blanca debe tener 1 curso más (C005 y C001)
        System.out.println("-----------------------------------------------------------------");
        
        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("\n--- Remocion de Curso (Verificacion de Limpieza) ---");
        utn.eliminarCurso("C002");
        
        System.out.println("\nLista de Ana despues de la eliminacion:");
        ana.listarCursos(); // Ana debe quedar sin cursos
        System.out.println("-----------------------------------------------------------------");
        
        // 7. Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("\n--- Remocion de Profesor (Verificacion de Limpieza) ---");
        utn.eliminarProfesor("P103"); // Elimina a Blanca (que tiene C001 y C005)

        System.out.println("\nEstado de los cursos desasociados:");
        c1.mostrarInfo(); // "Profesor: Sin asignar"
        c5.mostrarInfo(); // "Profesor: Sin asignar"
        System.out.println("-----------------------------------------------------------------");
        
        // 8. Mostrar un reporte: cantidad de cursos por profesor
        utn.mostrarReporteCursosPorProfesor(); // Ana: 0, Juan: 2, Blanca: 0 (Eliminado)
    }
}
