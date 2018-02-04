package jd.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("VETERINARIO>> Que animal curaré hoy?");
        Scanner scanner = new Scanner(System.in);
        do {
            AnimalDomestico g;
            AnimalDomestico p;
            AnimalDomestico c;
            AnimalDomestico s;
            Veterinario vet;

            g = new Gato("Tornillo", "Negro");
            p = new Perro("Frank", "Cafe", "Pug");
            s = new Rana("Splippy", "Verde", "Rana Toro");
            c = new Conejo("Buggs", "Blanco y Plomo");
            System.out.print("   1. Un gato \n   2. Un perro \n   3. Una Rana \n   4. Un conejo \n   5. No hay animales(Salir) \nCLIENTE>> ");
            String valorm = scanner.nextLine();
            int m = Integer.parseInt(valorm);
            switch (m) {
                case 1:
                    vet = new Veterinario(g);
                    vet.curar();
                    break;
                case 2:
                    vet = new Veterinario(p);
                    vet.curar();
                    break;
                case 3:
                    vet = new Veterinario(s);
                    vet.curar();
                    break;
                case 4:
                    vet = new Veterinario(c);
                    vet.curar();
                    break;
                case 5:
                    System.out.println("Todos estan Curados, adios!!");
                    System.exit(0);
                default:
                    System.out.println("No atiendo a ese animal (Opcion Invalida)");
            }
            System.out.println(" --------------------- ");
            System.out.println("  VETERINARIO>> Hay alguno más?");
        } while (true);

    }
}
