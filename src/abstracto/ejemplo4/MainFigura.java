package abstracto.ejemplo4;

public class MainFigura {
    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo("Rectángulo", "Rojo", 5, 3);
        rectangulo.mostrarInfo();

        FiguraGeometrica circulo = new Circulo("Círculo", "Azul", 4);
        circulo.mostrarInfo();
    }
}
