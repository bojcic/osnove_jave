package d07_09_2023;

import java.util.Scanner;

public class Zadatak4 {
//    Kreiranje klase "Film"
//    Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String). U glavnoj metodi
//    kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Film_zadatak4 film1 = new Film_zadatak4();
        System.out.print("Unesite naziv filma: ");
        film1.naziv = s.next();
        System.out.print("Unesite godinu izdanja filma: ");
        film1.godinaIzdanja = s.nextInt();
        System.out.print("Unesite režisera: ");
        film1.reziser = s.next();

        Film_zadatak4 film2 = new Film_zadatak4();
        System.out.print("Unesite naziv filma: ");
        film2.naziv = s.next();
        System.out.print("Unesite godinu izdanja filma: ");
        film2.godinaIzdanja = s.nextInt();;
        System.out.print("Unesite režisera: ");
        film2.reziser = s.next();

        Film_zadatak4 film3 = new Film_zadatak4();
        System.out.print("Unesite naziv filma: ");
        film3.naziv = s.next();
        System.out.print("Unesite godinu izdanja filma: ");
        film3.godinaIzdanja = s.nextInt();;
        System.out.print("Unesite režisera: ");
        film3.reziser = s.next();

        System.out.println("Film 1: " + film1.naziv + " - " + film1.godinaIzdanja + " - " + film1.godinaIzdanja);
        System.out.println("Film 2: " + film2.naziv + " - " + film2.godinaIzdanja + " - " + film2.godinaIzdanja);
        System.out.println("Film 3: " + film3.naziv + " - " + film3.godinaIzdanja + " - " + film3.godinaIzdanja);


    }

}
