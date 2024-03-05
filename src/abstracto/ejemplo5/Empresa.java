package abstracto.ejemplo5;

// Clase Empresa (Agregación)
class Empresa {
    private String nombre;
    private Empleado[] empleados;

    public Empresa(String nombre, Empleado[] empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public void mostrarInfoEmpleados() {
        System.out.println("Empresa: " + nombre);
        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
            System.out.println();
        }
    }
}
