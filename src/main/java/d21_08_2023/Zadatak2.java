package d21_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
//                Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 32
//        Unesite broj: 121
//        Unesite broj: 1333
//        Unesite broj: 144
//        Suma je: 265

        Scanner s = new Scanner(System.in);
        int sum = 0;
        int number = 0;

        System.out.print("Unesite N: ");
        int limit = s.nextInt();


        for (int i = 0; i < limit; i++) {
            System.out.print("Unesite broj: ");
            number = s.nextInt();
            if (number > 99 && number < 1000) {
                sum = sum + number;
            }

        }
        System.out.print("Suma parnih brojeva je " + sum);



    }
}
