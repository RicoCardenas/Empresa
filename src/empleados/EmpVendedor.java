package empleados;

// Definición de la clase EmpVendedor que extiende de la clase Empleado
public class EmpVendedor extends Empleado {
    // Variable de instancia privada para almacenar el valor de las ventas realizadas por el empleado vendedor
    private double valorVentas;

    // Constante estática para representar el salario mínimo
    private static final double SALARIO_MINIMO = 1000.0; // Asumiendo un salario mínimo de 1000

    // Constructor de la clase EmpVendedor que inicializa las variables de instancia
    public EmpVendedor(String registro, String nombre, String departamento, String puesto, double valorVentas) {
        super(registro, nombre, departamento, puesto); // Llama al constructor de la superclase Empleado
        this.valorVentas = valorVentas; // Inicializa el valor de las ventas del empleado vendedor
    }

    // Método getter para la variable de instancia valorVentas
    public double getValorVentas() {
        return valorVentas; // Devuelve el valor de las ventas del empleado vendedor
    }

    // Método setter para la variable de instancia valorVentas
    public void setValorVentas(double valorVentas) {
        this.valorVentas = valorVentas; // Establece el valor de las ventas del empleado vendedor
    }

    // Método para calcular el sueldo quincenal del empleado vendedor
    @Override
    public double calcularSueldoQuincenal() {
        return SALARIO_MINIMO + valorVentas * 0.02; // Devuelve el salario mínimo más el 2% del valor de las ventas, que es el sueldo quincenal
    }
}
