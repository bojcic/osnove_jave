package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i menja vrednost elementa
//        na poziciji 3 tako sto je povecava 10 puta.
//                Npr: 1,4,5,6,7 => 1,4,5,60,8
//        int a = 10;
//        a = a * 10;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int number = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Unesite broj: ");
            number = s.nextInt();
            numbers.add(number);

        }
        int x1 = numbers.get(3);
        x1 = x1 * 10;
        numbers.set(3,x1);

        System.out.println(numbers);

    }
}
