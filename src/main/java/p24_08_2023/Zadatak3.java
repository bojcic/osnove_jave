package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog
//        (na poziciji nula) i zadnjeg elemnta niza.
//        Objasnjenje: Ako je niz 2,4,5,6,7 nakon izmene treba da bude 7,4,5,6,2
//        Napomena: U zadataku nakon kreiraanja niza, ne treba da se desi kod koji setuje fiksne vrednosti u niz.

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int number = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Unesite broj: ");
            number = s.nextInt();
            numbers.add(number);

        }
        int x1 = numbers.get(0);
        int x2 = numbers.get((numbers.size() - 1));

        numbers.set(0,x2);
        numbers.set(numbers.size() - 1,x1);

        System.out.println(numbers);




    }
}
