package d07_09_2023;

import java.util.Scanner;

public class Zadatak5 {
//    Kreiranje klase "Oprema"
//    Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double). U glavnoj metodi kreirajte
//    3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Oprema_zadatak5 oprema1 = new Oprema_zadatak5();
    System.out.print("Unesite tip opreme: ");
    oprema1.tip = s.next();
    System.out.print("Unesite marku: ");
    oprema1.marka = s.next();
    System.out.print("Unesite cenu: ");
    oprema1.cena = s.nextDouble();


    Oprema_zadatak5 oprema2 = new Oprema_zadatak5();
    System.out.print("Unesite tip opreme: ");
    oprema2.tip = s.next();
    System.out.print("Unesite marku: ");
    oprema2.marka = s.next();
    System.out.print("Unesite cenu: ");
    oprema2.cena = s.nextDouble();


    Oprema_zadatak5 oprema3 = new Oprema_zadatak5();
    System.out.print("Unesite tip opreme: ");
    oprema3.tip = s.next();
    System.out.print("Unesite marku: ");
    oprema3.marka = s.next();
    System.out.print("Unesite cenu: ");
    oprema3.cena = s.nextDouble();


    System.out.println("Oprema 1: " + oprema1.tip + " - " + oprema1.marka + " - " + oprema1.cena);
    System.out.println("Oprema 2: " + oprema2.tip + " - " + oprema2.marka + " - " + oprema2.cena);
    System.out.println("Oprema 3: " + oprema3.tip + " - " + oprema3.marka + " - " + oprema3.cena);
}

}
