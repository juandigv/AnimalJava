package jd.company;

public class Main {

    public static void main(String[] args) {


        AnimalDomestico g;
        AnimalDomestico p;
        g = new Gato("Tom", "Negro");
        g.saludar();
        p = new Perro("Frank", "Cafe", "Pug");
        p.saludar();
    }
}

