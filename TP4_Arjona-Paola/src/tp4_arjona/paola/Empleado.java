package tp4_arjona.paola;

// Se define la clase Empleado
public class Empleado {
    // Atributos
    private int id; 
    private String nombre;
    private String puesto;
    private double salario;
    // Atributos estaticos
    private static int totalEmpleados = 0; // Contador de empleados creados
    private static int nextId = 1;         // Siguiente ID a asignar cuando el ID es automático
    
    // Salario por defecto(guion bajo para legibilidad: 500_000.0 = 500.000.0)
    private static final double SALARIO_DEFECTO = 500_000.0; 
    
    // Constructor completo (recibe todos los atributos como parámetros)
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;                 // uso de this
        this.nombre = nombre;         // 'this.nombre' (campo) = 'nombre' (parámetro)
        this.puesto = puesto;         
        this.salario = salario;       
        totalEmpleados++;             // Incrementa el contador global al crear un empleado
        if (id >= nextId) nextId = id + 1; // Mantiene coherente el generador de IDs
    }

    // Constructor parcial (recibe solo nombre y puesto, asignando un id automático y un salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = nextId++;            // Toma el siguiente id disponible y luego lo incrementa
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_DEFECTO; // Inicia con el salario por defecto
        totalEmpleados++; // Suma 1 al contador global
    }

    // Métodos sobrecargados actualizarSalario ---------------------------------

    // a) Por porcentaje de aumento: 10 -> +10%. Pasar un double (10.0, 5.0, etc.) 
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // b) Por monto fijo (int) a aumentar: suma una cantidad fija. Pasar un int
    public void actualizarSalario(int montoFijo) {
        this.salario += montoFijo;
    }
    
    // Método toString legible -------------------------------------------------
    @Override
    public String toString() { 
        return "Empleado {id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + String.format("%.2f", salario) + "}"; // Devuelve una cadena legible con los datos del empleado
    }

    // Método estático para ver el total de empleados --------------------------
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters -------------------------------------------------------
    public int getId() { 
        return id; } // devuelve el valor del atributo 'id'. No setter porque normalmente no se cambia una vez asignado

    public String getNombre() { 
        return nombre; } // devuelve el nombre actual del empleado
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; } // 'this.nombre' es el atributo y 'nombre' el parámetro recibido

    public String getPuesto() { 
        return puesto; } // devuelve el puesto del empleado
    
    public void setPuesto(String puesto) { 
        this.puesto = puesto; } // permite actualizar el puesto o cargo del empleado

    public double getSalario() { 
        return salario; } // devuelve el salario actual del empleado
    
    public void setSalario(double salario) { 
        this.salario = salario; // permite asignar un nuevo salario al empleado
    }  
}
