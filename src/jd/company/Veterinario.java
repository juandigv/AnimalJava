package jd.company;

public class Veterinario {
    AnimalDomestico animal;


    public Veterinario(AnimalDomestico animal) {
        this.animal = animal;
    }

    public void curar() {
        if (this.animal instanceof Gato)
            System.out.println("Estoy curando un Gato");
        else
            System.out.println("Estoy curando un Perro");
        this.animal.saludar();
    }
}
