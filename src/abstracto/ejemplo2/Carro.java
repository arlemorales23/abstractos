package abstracto.ejemplo2;

public abstract class Carro {
   private String marca;
    // Comentario: Declaramos la clase abstracta Carro con el modificador "abstract".
    // Esto significa que no se pueden crear objetos de esta clase.

    // Comentario: Declaramos el método abstracto "acelerar()".
    // Los métodos abstractos no tienen implementación, por lo que deben ser implementados por las subclases.

    public abstract void acelerar();

    // Comentario: Declaramos el método final "getMarca()".
    // Los métodos finales no pueden ser sobrescritos por las subclases.

    public final String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    // Comentario: Declaramos el constructor de la clase Carro.

    public Carro() {
        System.out.println("Se ha creado un nuevo carro");
    }
}


