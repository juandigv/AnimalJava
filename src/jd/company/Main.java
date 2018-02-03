package jd.company;

public class Main {

    public static void main(String[] args) {


        AnimalDomestico g;
        AnimalDomestico p;

        Veterinario vet;
        g = new Gato("Tom", "Negro");
        p = new Perro("Frank", "Cafe", "Pug");
        vet = new Veterinario(g);
        vet.curar();

      //  g.saludar();

        //p.saludar();
    }
}

