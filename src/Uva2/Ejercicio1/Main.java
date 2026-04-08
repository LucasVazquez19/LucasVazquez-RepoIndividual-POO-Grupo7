package Uva2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Televisor tele1 = new Televisor("Sony", "Sony X80K", 2022,
                Televisor.tipoDeTelevisor.p, 55,"1920x1080",true);
        Televisor tele2 = new Televisor("Sony", "Sony X80K", 2024,
                Televisor.tipoDeTelevisor.p, 60,"4K",true);

        tele1.prenderTelevision();
        System.out.println("Televisor 1: ");
        System.out.println(" ");
        System.out.println(tele1.toString());
        System.out.println("-----------------------------");
        System.out.println("Televisor 2: ");
        System.out.println(" ");
        System.out.println(tele2.toString());

        System.out.println("-----------------------------");

        System.out.println("El televisor 1 esta prendido? " + tele1.estaPrendido());
    }
}
