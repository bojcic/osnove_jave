package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i prikazuje sumu nultog i
//        zadnjeg elementa tog niza.

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int sum = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Unesite broj: ");
            int number = s.nextInt();
            numbers.add(number);

        }
        int x1 = numbers.get(0);
        int x2 = numbers.get(numbers.size() - 1);
        sum = x1 + x2;

        System.out.println(sum);


    }
}
