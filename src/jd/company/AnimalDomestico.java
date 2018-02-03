package jd.company;

abstract public class AnimalDomestico {
    String nombre;
    String color;

    public AnimalDomestico(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    abstract public void saludar();

}