package empleados;
import java.util.Scanner;

// Definición de la clase EmpMecanico que extiende de la clase Empleado
public class EmpMecanico extends Empleado {
    // Variable de instancia privada para almacenar el valor de los trabajos realizados por el empleado mecánico
    private double valorTrabajos;

    // Constructor de la clase EmpMecanico que inicializa las variables de instancia
    public EmpMecanico() {
        super(); // Llama al constructor de la superclase Empleado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de los trabajos realizados por: " + nombre);
        this.valorTrabajos = scanner.nextDouble();
    }

    // Método getter para la variable de instancia valorTrabajos
    public double getValorTrabajos() {
        return valorTrabajos; // Devuelve el valor de los trabajos del empleado mecánico
    }

    // Método setter para la variable de instancia valorTrabajos
    public void setValorTrabajos(double valorTrabajos) {
        this.valorTrabajos = valorTrabajos; // Establece el valor de los trabajos del empleado mecánico
    }

    // Método para calcular el sueldo quincenal del empleado mecánico
    @Override
    public double calcularSueldoQuincenal() {
        return valorTrabajos * 0.04; // Devuelve el 4% del valor de los trabajos, que es el sueldo quincenal
    }
}
