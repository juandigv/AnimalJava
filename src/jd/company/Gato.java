package jd.company;

public class Gato extends AnimalDomestico {

    public Gato(String nombre, String color)

    {
        super(nombre, color);
    }

    public void saludar()

    {
        System.out.println("   MIAU MIAU ");
    }
}