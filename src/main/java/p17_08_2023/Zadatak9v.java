package p17_08_2023;

import java.util.Scanner;

public class Zadatak9v {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//  Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
//  znak karte koja je na stolu
//  broj karte koja je na stolu
//  znak karte koju igrac zeli da odigra
//  broj karte koju igrac zeli da odigra
//  i nakon toga se na ekranu ispisuje da li je potez ispravan. Potez je ispravan ukoliko se karta na stolu i odigrana
//  karta poklapaju po znaku ili broju.
//  Znakovi karata: srce, kocka, list, detelina
//  Brojevi karata: 2,3,4,5,6,7,8,9,10,A,J,Q,K
//
//        Primer izvrsenja 1:
//        Znak karte na stolu: srce
//        Broj karte na stolu: A
//        Znak karte koju zelis da odigras: detelina
//        Broja karte koju zelis da odigras: A
//        Potez je validan.
//
//                Primer izvrsenja 2:
//        Znak karte na stolu: srce
//        Broj karte na stolu: A
//        Znak karte koju zelis da odigras: srce
//        Broja karte koju zelis da odigras: K
//        Potez je validan.
//
//
//                Primer izvrsenja 3:
//        Znak karte na stolu: srce
//        Broj karte na stolu: A
//        Znak karte koju zelis da odigras: detelina
//        Broja karte koju zelis da odigras: K
//        Potez nije validan.

        System.out.print("Unesite znak karte na stolu:");
        String znakSto = s.next();

        System.out.print("Unesite broj karte na stolu:");
        int brojSto = s.nextInt();

        System.out.print("Unesite znak karte koju želite da odigrate:");
        String znakRuka = s.next();

        System.out.print("Unesite broj karte koju želite da odigrate:");
        int brojRuka = s.nextInt();

        if ((znakSto == znakRuka) || (brojSto == brojRuka)) {
            System.out.println("Potez je validan");
        } else {
            System.out.println("Potez je nevalidan");
        }


    }
}
