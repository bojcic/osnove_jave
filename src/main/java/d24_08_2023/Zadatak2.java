package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//                Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 4
//        Unesite broj: 7
//        Unesite broj: 8
//        U nizu ima 2 parna broja.

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int counter = 0;

        System.out.print("Unesite N: ");
        int repeat = s.nextInt();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Unesite broj: ");
            int input = s.nextInt();
            numbers.add(input);
            if (input%2==0){
                counter++;
            }
        }

        System.out.println("Parnih brojeva u nizu ima " + counter);


    }
}
