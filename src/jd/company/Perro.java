package jd.company;

public class Perro extends AnimalDomestico {
    private String raza;

    public Perro(String nombre, String color, String raza)

    {
        super(nombre, color);
        this.raza=raza;
    }

    public void saludar() {
        System.out.println("GUAU GUAU ");

    }
}