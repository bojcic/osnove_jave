package p25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
//    Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red.. Broj zvezdica je odredjen parametrom N.
//    Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//    N=5, print je=> * * * * *
//
//    Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//    N=9, print je=> * * * * * * * * *

//    Napisati main program koji koristi kreiranu metodu tako da stampa sledecu sliku za M. M unosi korisnik. Zadatak
//    resiti koristeci petlju u main metodi.
//    Primer izvrsenja:
//    Unesite M: 6
//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * * * *
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int repeat = 0;
    int levels = 0;

    System.out.println("Unesite N: ");
    repeat = s.nextInt();

    print(repeat, levels);

    System.out.println("Unesite M: ");
    levels = s.nextInt();

    String stars = "";
    for (int i = 0; i < levels; i++) {
        stars = stars + "* ";
        System.out.println(stars);
        System.out.println();
    }
}

public static void print(int repeat, int levels){
    for (int i = 0; i < repeat; i++) {
        System.out.print("* ");
    }
    System.out.println();


}
}
