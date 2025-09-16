
package tp4_arjona.paola;


public class Ejercicio2TP4 {
    /* 2. Crear una clase de prueba con método main que:
    -Instancie varios objetos usando ambos constructores.
    -Aplique los métodos actualizarSalario() sobre distintos empleados.
    -Imprima la información de cada empleado con toString().
    -Muestre el total de empleados creados con mostrarTotalEmpleados()*/
    
    public static void main(String[] args) {
        // Objetos usando constructor completo
        Empleado e1 = new Empleado(100, "Ana Cortez", "Desarrolladora", 800_000.0); // Se coloca guion bajo para mejor legibilidad

        // Objetos usando constructor parcial
        Empleado e2 = new Empleado("Luis Perez", "Programador");
        Empleado e3 = new Empleado("Marta Luna", "Project Manager");

        // Método Actualización de salario
        e1.actualizarSalario(10.0);   // +10% a Ana -> 800.000 + 10% = 880 000,00
        e2.actualizarSalario(50_000); // +$50.000 a Luis (monto fijo) -> 500.000 + 50.000 = 550.000,00
        e3.actualizarSalario(5.0);    // +5% a Marta -> 500.000 + 5% = 525.000,00

        // Imprimir información de empleados (toString)
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }   

}
