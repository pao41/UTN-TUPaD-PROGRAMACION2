package Ejercicio3;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // Lista de empleados (inicializacion)
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        // Crear empleados y agregar a la lista, usando nombres
        EmpleadoPlanta emp1 = new EmpleadoPlanta("Carlos");
        EmpleadoPlanta emp2 = new EmpleadoPlanta("Ana");
        EmpleadoTemporal emp3 = new EmpleadoTemporal("Sofia");
        EmpleadoTemporal emp4 = new EmpleadoTemporal("Luis");
        
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        
        System.out.println("--- Reporte de Sueldos ---");

        int i = 1; // Empezamos el índice en 1
        
        // Recorremos la lista y llamamos al método para calcular sueldo
        for(Empleado e : empleados) {
            
            // e.calcularSueldo() llama a la implementación correcta
            double sueldo = e.calcularSueldo();
            
            String tipo;
            // Uso de instanceof para clasificar el tipo de empleado
            if (e instanceof EmpleadoPlanta) {
                tipo = "Planta";
            } else if (e instanceof EmpleadoTemporal) {
                tipo = "Temporal";
            } else {
                tipo = "Desconocido";
            }
            // Mostrar resultados
            System.out.printf("Empleado %d (%s) | Tipo: %s | Cobra: $%.2f%n", 
                i, 
                e.getNombre(), 
                tipo,
                sueldo
            );
            i++; 
        }
        }
        
      

}
