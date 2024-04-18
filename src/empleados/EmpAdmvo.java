package empleados;
import java.util.Scanner;

// Definición de la clase EmpAdmvo que extiende de la clase Empleado
public class EmpAdmvo extends Empleado {
    // Variable de instancia privada para almacenar el sueldo mensual del empleado administrativo
    private double sueldoMensual;

    // Constructor de la clase EmpAdmvo que inicializa las variables de instancia
    public EmpAdmvo() {
        super(); // Llama al constructor de la superclase Empleado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo mensual de: " + nombre);
        this.sueldoMensual = scanner.nextDouble();
    }

    // Método getter para la variable de instancia sueldoMensual
    public double getSueldoMensual() {
        return sueldoMensual; // Devuelve el sueldo mensual del empleado administrativo
    }

    // Método setter para la variable de instancia sueldoMensual
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual; // Establece el sueldo mensual del empleado administrativo
    }

    // Método para calcular el sueldo quincenal del empleado administrativo
    @Override
    public double calcularSueldoQuincenal() {
        return sueldoMensual / 2; // Devuelve la mitad del sueldo mensual, que es el sueldo quincenal
    }
}
