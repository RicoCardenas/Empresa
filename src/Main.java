import empleados.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de empleados
        EmpAdmvo empAdmvo = new EmpAdmvo("001", "Julian", "Administración", "Gerente", 5000.0);
        EmpMecanico empMecanico = new EmpMecanico("002", "Felipe", "Taller", "Mecánico", 10000.0);
        EmpVendedor empVendedor = new EmpVendedor("003", "Alejandra", "Ventas", "Vendedor", 20000.0);

        // Crear un Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que elija un empleado
        int eleccion;
        do {
            System.out.println("Por favor, elige un empleado:");
            System.out.println("1. Julian");
            System.out.println("2. Felipe");
            System.out.println("3. Alejandra");
            System.out.println("0. Exit");

            // Obtener la elección del usuario
            eleccion = scanner.nextInt();

            // Usar un switch para manejar las diferentes opciones
            switch (eleccion) {
                case 1:
                    imprimirDetallesEmpleado(empAdmvo);
                    break;
                case 2:
                    imprimirDetallesEmpleado(empMecanico);
                    break;
                case 3:
                    imprimirDetallesEmpleado(empVendedor);
                    break;
                case 0:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (eleccion != 0);
    }

    // Método para imprimir los detalles de un empleado
    public static void imprimirDetallesEmpleado(Empleado empleado) {
        double sueldo = empleado.calcularSueldoQuincenal();
        System.out.println("Empleado: " + empleado.getNombre() + ", Puesto: " + empleado.getPuesto() + ", Sueldo Quincenal: " + sueldo);
    }
}