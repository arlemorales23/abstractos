package abstracto.ejemplo3;

public class CasaDeCiudad extends Casa {

    // Comentario: Declaramos la propiedad "ascensor".
    // La propiedad es de tipo boolean y es privada.

    private final boolean ascensor;

    // Comentario: Declaramos el constructor de la clase "CasaDeCiudad".

    public CasaDeCiudad(int habitaciones, boolean ascensor) {
        super(habitaciones);
        this.ascensor = ascensor;
    }

    // Comentario: Declaramos la implementación del método "getPrecio()".

    @Override
    public double getPrecio() {
        double precioBase = 200000;
        if (ascensor) {
            precioBase += 50000;
        }
        return precioBase * getHabitaciones();
    }
}
