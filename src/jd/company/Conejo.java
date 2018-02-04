package jd.company;

public class Conejo extends AnimalDomestico {

    public Conejo(String nombre, String color)

    {
        super(nombre, color);
    }

    public void saludar()

    {
        double random = Math.random();

        if(random < 0.5)
            System.out.println("   Yeet Yeet ");
        else
            System.out.println("   Que hay de nuevo viejo? ");

    }
}