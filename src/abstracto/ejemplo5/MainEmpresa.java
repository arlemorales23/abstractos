package abstracto.ejemplo5;

public class MainEmpresa {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoPorHoras("Juan", 160, 15.0);
        Empleado empleado2 = new EmpleadoConSalarioFijo("María", 180, 3000.0);

        Empleado[] empleados = {empleado1, empleado2};
        Empresa empresa = new Empresa("Acme Inc.", empleados);

        empresa.mostrarInfoEmpleados();
    }
}
