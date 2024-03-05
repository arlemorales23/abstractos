package abstracto.ejemplo6;

public class MainVeterinaria {
    public static void main(String[] args) {
        // Creación de clientes y mascotas
        Cliente cliente1 = new Cliente("Juan");
        cliente1.agregarMascota(new Perro("Firulais", 3));
        cliente1.agregarMascota(new Gato("Pelusa", 2));

        Cliente cliente2 = new Cliente("María");
        cliente2.agregarMascota(new Perro("Toby", 5));

        // Mostrar mascotas de los clientes
        cliente1.mostrarMascotas();
        System.out.println();
        cliente2.mostrarMascotas();
    }
}
