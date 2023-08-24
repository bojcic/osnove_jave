package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i
//        racuna i stampa sumu svih brojeva niza.
//        Primer: Ako je niz 1,2,4,5,7
//        Stampa se, suma = 19

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (int i = 0; i < numbers.size(); i++) {
            int x = numbers.get(i);
            sum = sum + x;

        }
        System.out.println("Suma je " + sum);

    }
}
