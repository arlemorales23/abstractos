package abstracto.ejemplo4;

// Clase abstracta
abstract class FiguraGeometrica {
    // Atributos
    private String nombre;
    private String color;

    // Constructor
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Métodos concretos
    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    // Método abstracto
    public abstract double calcularArea();

    // Método concreto
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Área: " + calcularArea());
    }
}

// Subclase que implementa el método abstracto
class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
// Subclase que implementa el método abstracto
class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

