package p07_09_2023;

import java.util.Scanner;

public class Zadatak1 {
    //		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//    Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//    Primer izvrsenja:
//    Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//    Primalac: Marko Markovic, 840-23932-334, stanje: 200
//    Unesite sumu za transakciju: 500
//    Stanje nakon stransakcije
//    Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//    Primalac: Marko Markovic, 840-23932-334, stanje: 700

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Racun prvi = new Racun();
        prvi.brojRacuna = "840-23932-323";
        prvi.imeIPrezime = "Pera Perić";
        prvi.stanje = 1000;

        Racun drugi = new Racun();
        drugi.brojRacuna = "840-2952352-323";
        drugi.imeIPrezime = "Zvonko Bombonko";
        drugi.stanje = 200;

        System.out.println("Pošaljilac: " + prvi.imeIPrezime + ", " + prvi.brojRacuna + ", stanje: " + prvi.stanje);
        System.out.println("Primalac: " + drugi.imeIPrezime + ", " + drugi.brojRacuna + ", stanje: " + drugi.stanje);

        System.out.println("Unesite sumu za transakciju: ");
        double transaction = s.nextDouble();

        prvi.stanje = prvi.stanje - transaction;
        drugi.stanje = drugi.stanje +transaction;

        System.out.println("Stanje nakon transakcije: ");
        System.out.println("Pošaljilac: " + prvi.imeIPrezime + ", " + prvi.brojRacuna + ", stanje: " + (prvi.stanje - transaction));
        System.out.println("Primalac: " + drugi.imeIPrezime + ", " + drugi.brojRacuna + ", stanje: " + (drugi.stanje +transaction));




    }
}
