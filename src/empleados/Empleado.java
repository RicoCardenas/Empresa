package empleados;
import java.util.Scanner;

// Definición de la clase Empleado
public class Empleado {
    // Variables de instancia protegidas para almacenar el registro, nombre, departamento y puesto del empleado
    protected String registro;
    protected String nombre;
    protected String departamento;
    protected String puesto;

    // Constructor de la clase Empleado que inicializa las variables de instancia
    public Empleado() {
        solicitarDatosEmpleado();
    }

    private void solicitarDatosEmpleado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de registro del empleado:");
        this.registro = scanner.nextLine();

        System.out.println("Ingrese el nombre del empleado:");
        this.nombre = scanner.nextLine();

        System.out.println("Ingrese el departamento del empleado:");
        this.departamento = scanner.nextLine();

        System.out.println("Ingrese el puesto del empleado:");
        this.puesto = scanner.nextLine();
    }
    // Métodos getter y setter para las variables de instancia

    // Devuelve el registro del empleado
    public String getRegistro() {
        return registro;
    }

    // Establece el registro del empleado
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    // Devuelve el nombre del empleado
    public String getNombre() {
        return nombre;
    }

    // Establece el nombre del empleado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve el departamento del empleado
    public String getDepartamento() {
        return departamento;
    }

    // Establece el departamento del empleado
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Devuelve el puesto del empleado
    public String getPuesto() {
        return puesto;
    }

    // Establece el puesto del empleado
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // Método para calcular el sueldo quincenal del empleado
    // Este método se sobrescribirá en las subclases
    public double calcularSueldoQuincenal() {
        return 0.0; // Devuelve 0.0 por defecto
    }
}