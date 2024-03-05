package abstracto.ejemplo1;

public abstract class Animal {
// Comentario: Declaramos la clase abstracta Animal con el modificador "abstract".
// Esto significa que no se pueden crear objetos de esta clase.

// Comentario: Declaramos el método abstracto "makeNoise()".
// Los métodos abstractos no tienen implementación, por lo que deben ser implementados por las subclases.

    public abstract void makeNoise();

// Comentario: Declaramos el método estático "staticMethod()".
// Los métodos estáticos son miembros de la clase, no de los objetos.

    public static void staticMethod() {

        System.out.println("Este es un método estático de la clase Animal");
    }

// Comentario: Declaramos el método implementado "eat()".
// Este método tiene una implementación, por lo que no es necesario que sea implementado por las subclases.

    public void eat() {
        System.out.println("El animal está comiendo");
    }
}
