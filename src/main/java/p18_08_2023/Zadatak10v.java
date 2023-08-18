package p18_08_2023;

import java.util.Scanner;

public class Zadatak10v {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        (Za vezbanje)
//        Napisati program koji stampa 20 pozicija.
//                Za aktivnu poziciju stampa *
//                Za neaktivnu pozciju stampa _
//        Korisnik unosi granice za nekativni opseg, unoseci A i B.
//                Primer izvrsenja:
//        Unesite a: 5
//        Unesite b: 10
//                * * * * _ _ _ _ _ _ * * * * * * * * * *
//        Objasnjenje: stampamo _ od 5 do 10 u ostalim situacijama stampamo *

        System.out.print("Unesite broj a:");
        int a = s.nextInt();

        System.out.print("Unesite broj b:");
        int b = s.nextInt();

        for (int i = 0; i <= 20; i++) {
            if (i<a || i>b) {
                System.out.print("* ");
            } else {
                System.out.print("_ ");
            }
        }





    }
}
