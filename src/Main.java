import empleados.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables para almacenar los detalles de los empleados
        String admRegistro;
        String admName;
        String admDpto;
        String admGerente;
        double admSueldom;
        Scanner datos = new Scanner(System.in);


        
        // Crear instancias de empleados

        // Crear un Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que elija un empleado
        int eleccion;
        do {
            System.out.println("Por favor, sobre quien desea preguntar: ");
            System.out.println("1. Adminstrador");
            System.out.println("2. Mecanico");
            System.out.println("3. Vendedor");
            System.out.println("0. Exit");

            // Obtener la elección del usuario
            eleccion = scanner.nextInt();

            // Usar un switch para manejar las diferentes opciones
            switch (eleccion) {
                case 1:
                    EmpAdmvo empAdmvo = new EmpAdmvo();
                    imprimirDetallesEmpleado(empAdmvo);
                    break;
                case 2:
                    EmpMecanico empMecanico = new EmpMecanico();
                    imprimirDetallesEmpleado(empMecanico);
                    break;
                case 3:
                    EmpVendedor empVendedor = new EmpVendedor();
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