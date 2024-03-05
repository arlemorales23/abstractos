package abstracto.ejemplo3;

public class MainCasa {
    public static void main(String[] args) {
        // Creamos una casa de campo con 3 habitaciones y piscina
        CasaDeCampo casaDeCampo = new CasaDeCampo(3, true);
        System.out.println("El precio de la casa de campo es de: " + casaDeCampo.getPrecio());

        // Creamos una casa de ciudad con 4 habitaciones y ascensor
        CasaDeCiudad casaDeCiudad = new CasaDeCiudad(4, true);
        System.out.println("El precio de la casa de ciudad es de: " + casaDeCiudad.getPrecio());
    }
}
