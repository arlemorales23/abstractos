package abstracto.ejemplo3;

public class CasaDeCampo extends Casa {

    // Comentario: Declaramos la propiedad "piscina".
    // La propiedad es de tipo boolean y es privada.

    private final boolean piscina;

    // Comentario: Declaramos el constructor de la clase "CasaDeCampo".

    public CasaDeCampo(int habitaciones, boolean piscina) {
        super(habitaciones);
        this.piscina = piscina;
    }

    // Comentario: Declaramos la implementación del método "getPrecio()".

    @Override
    public double getPrecio() {
        double precioBase = 100000;
        if (piscina) {
            precioBase += 20000;
        }
        return precioBase * getHabitaciones();
    }
}