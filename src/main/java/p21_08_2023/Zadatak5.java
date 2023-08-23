package p21_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji od korisnika ucitava N brojeva  i ispisuje sumu tih brojeva. N nam kaze koliko broja ce korisnik da unese.
//                Primer izvrsenja:
//        Unesite N: 3
//        Unesite broj: 1
//        Unesite broj: 4
//        Unesite broj: 9
//        Suma je 14.

        int suma = 0;
        System.out.print("Unesite broj n: ");
        int n = s.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.print("Unesite broj: ");
            int x = s.nextInt();
            suma = suma + x;
        }

        System.out.println("Suma je " + suma);


    }
}
