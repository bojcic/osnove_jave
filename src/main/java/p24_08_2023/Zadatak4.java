package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na
//        poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//        Primer:
//        Unesite pozicjiu: 2
//        Na pozicji 2 je vrednost 7.

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);


        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.print("Unesite poziciju (0-4): ");
        int position = s.nextInt();

        System.out.print("Na poziciji " + position + "je vrednost " + numbers.get(position));


    }
}
