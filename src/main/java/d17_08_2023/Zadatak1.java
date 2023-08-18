package d17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//  Napisati program koji ima informacije koje ucitava informacije sa tastature:
//  Ime
//  Prezime
//  godinu rodjenja
//  I stampa informaicije u formatu:
//  [ime] [prezime] - [startost] god
//
//  Primer izvrsenja:
//  Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
//  Milan Jovanovic - 26 god

        System.out.print("Unesite ime: ");
        String firstName = s.next();

        System.out.print("Unesite prezime: ");
        String lastName = s.next();

        System.out.print("Unesite godinu rođenja: ");
        int yearBorn = s.nextInt();
        int yearCurrent = 2023;
        int yearNumber = yearCurrent - yearBorn;

        System.out.println(firstName + " " + lastName + " - " + yearNumber + " god");


//          DONE




    }
}
