package jd.company;

public class Rana extends AnimalDomestico {
    private String tipo;
    public Rana(String nombre, String color,String tipo)

    {
        super(nombre, color);
        this.tipo=tipo;
    }

    public void saludar()

    {
        double random = Math.random();

        if(random < 0.5)
            System.out.println("   Croac Croac ");
        else
            System.out.println("   It Is Wednesday My Dudes");

    }
}