package d07_09_2023;

public class Zadatak3 {
//    Kreiranje klase "Proizvod"
//    Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove
//    klase i postavite im vrednosti. Ispisati informacije o proizvodima.
    public static void main(String[] args) {
        Proizvod_zadatak3 zvake = new Proizvod_zadatak3();
        zvake.naziv = "Orbit";
        zvake.cena = 64.99;

        Proizvod_zadatak3 sok = new Proizvod_zadatak3();
        sok.naziv = "Coca-Cola";
        sok.cena = 72.99;

        Proizvod_zadatak3 cips = new Proizvod_zadatak3();
        cips.naziv = "Doritos";
        cips.cena = 209.99;

        System.out.println("Žvake: " + zvake.naziv + " - " + zvake.cena);
        System.out.println("Sok: " + sok.naziv + " - " + sok.cena);
        System.out.println("Čips: " + cips.naziv + " - " + cips.cena);
    }
}
