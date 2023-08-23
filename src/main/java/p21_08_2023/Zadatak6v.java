package p21_08_2023;

import java.util.Scanner;

public class Zadatak6v {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//
//        (ZA VEZBANJE)Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira
//        rezultujuci broj kao na primeru
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 0
//        Unesite broj: 4
//        Unesite broj: 1
//        Rezultujuci broj je 12041 (Promenljiva tipa int)


       int suma = 0;
        System.out.print("Unesite broj n: ");
        int n = s.nextInt();
        int result = 0;

        for (int i = 1; i<=n; i++){
            System.out.print("Unesite broj: ");
            int x = s.nextInt();
            result = result * 10 + x;

        }
        System.out.println("Suma je " + result);

    }
}
