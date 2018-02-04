package jd.company;

public class Veterinario {
    AnimalDomestico animal;


    public Veterinario(AnimalDomestico animal) {
        this.animal = animal;
    }

    public void curar() {
        if (this.animal instanceof Gato)
            System.out.println("VETERINARIO>> Estoy curando al Gato" + animal.nombre);
        else if (this.animal instanceof Perro)
            System.out.println("VETERINARIO>> Estoy curando al Perro"+ animal.nombre);
        else if (this.animal instanceof Rana)
            System.out.println("VETERINARIO>> Estoy curando a la Rana"+ animal.nombre);
        else
            System.out.println("VETERINARIO>> Estoy curando al Conejo"+ animal.nombre);

        this.animal.saludar();

        System.out.println("VETERINARIO>> Ya está curado!");
    }
}
