package d18_08_2023;

import java.util.Scanner;

public class Zadatak6v {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//  Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//  Primer izvrsenja:
//  Unesite dimenziju table: 5
//  _|_|_|_|_|
//  _|_|_|_|_|
//  _|_|_|_|_|
//  _|_|_|_|_|
//  _|_|_|_|_|

        System.out.print("Unesite dimenziju tabele : ");
        int x = s.nextInt();

        for (int i = 1; i <= x * x ; i++) {
            if (!(i % x == 0)){
                System.out.print("_|");
            } else {
                System.out.println("_| ");
            }
        }




    }
}
