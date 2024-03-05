package abstracto.ejemplo6;

import java.util.ArrayList;

class Cliente {
    private String nombre;
    private ArrayList<Animal> mascotas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Animal animal) {
        mascotas.add(animal);
    }

    public void mostrarMascotas() {
        System.out.println("Mascotas de " + nombre + ":");
        for (Animal mascota : mascotas) {
            System.out.println(mascota.getClass().getSimpleName() + " - Nombre: " + mascota.getNombre() + ", Edad: " + mascota.getEdad());
            mascota.hacerSonido();
        }
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Animal> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Animal> mascotas) {
        this.mascotas = mascotas;
    }
}