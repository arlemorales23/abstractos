package abstracto.ejemplo1;

public class MainAnimal {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.makeNoise();
       /*
El método estático staticMethod() se puede usar de la misma manera que
cualquier otro método estático. Para llamar a un método estático, no necesitamos
crear un objeto de la clase. En su lugar, podemos usar el operador . para llamar
al método directamente desde la clase.
Por ejemplo, aquí hay un ejemplo de cómo usar el método estático staticMethod():*/
        Animal.staticMethod();
        perro.eat();
    }
}
