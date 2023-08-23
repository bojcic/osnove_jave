package d21_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve.
//        Na kraju programa prikazati sumu.
//                Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 9
//        Unesite broj: 6
//        Unesite broj: 8
//        Suma parnih brojeva je 16
//        Objasnjenje: 2 + 6 + 8 = 16
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int number = 0;

        System.out.print("Unesite N: ");
        int limit = s.nextInt();


        for (int i = 0; i < limit; i++) {
            System.out.print("Unesite broj: ");
            number = s.nextInt();
            if (number % 2 == 0) {
                sum = sum + number;
            }

        }
        System.out.print("Suma parnih brojeva je " + sum);

    }
}
