package abstracto.ejemplo2;

public class MainCarro {
    public static void main(String[] args) {
        CarroDeportivo carroDeportivo = new CarroDeportivo();
        carroDeportivo.acelerar();
        carroDeportivo.setMarca("Mazda");
        System.out.println(carroDeportivo.getMarca());
    }
}
