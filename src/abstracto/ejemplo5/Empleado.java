package abstracto.ejemplo5;

// Clase abstracta Empleado
abstract class Empleado {
    private String nombre;
    private int horasTrabajadas;

    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Método para mostrar la información del empleado y su salario
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Horas trabajadas: " + getHorasTrabajadas());
        System.out.println("Salario: $" + calcularSalario());
    }
}

// Clase concreta EmpleadoPorHoras
class EmpleadoPorHoras extends Empleado {
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, horasTrabajadas);
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return getHorasTrabajadas() * tarifaPorHora;
    }
}

// Clase concreta EmpleadoConSalarioFijo
class EmpleadoConSalarioFijo extends Empleado {
    private double salarioFijo;

    public EmpleadoConSalarioFijo(String nombre, int horasTrabajadas, double salarioFijo) {
        super(nombre, horasTrabajadas);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;
    }
}
