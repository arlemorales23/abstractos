package abstracto.ejemplo3;

public abstract class Casa {

    // Comentario: Declaramos la clase abstracta Casa con el modificador "abstract".
    // Esto significa que no se pueden crear objetos de esta clase.

    // Comentario: Declaramos la propiedad "habitaciones".
    // La propiedad es de tipo int y es privada.

    private int habitaciones;

    // Comentario: Declaramos el método "getHabitaciones()" para acceder a la propiedad "habitaciones".

    public int getHabitaciones() {
        return this.habitaciones;
    }

    // Comentario: Declaramos el método "setHabitaciones()" para establecer el valor de la propiedad "habitaciones".

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    // Comentario: Declaramos el método "constructor()".

    public Casa(int habitaciones) {
        this.habitaciones = habitaciones;
        System.out.println("Se ha creado una nueva casa");
    }

    // Comentario: Declaramos el método abstracto "getPrecio()".
    // Este método debe ser implementado por las subclases.

    public abstract double getPrecio();
}
