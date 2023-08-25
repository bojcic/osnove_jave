package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//                Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 7
//        Unesite broj: 3
//        Unesite broj: 9
//        Unesite X: 3
//
//        Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int number =0;

        System.out.print("Unesite N: ");
        int repeat = s.nextInt();

        for (int i = 0; i < repeat; i++) {
            System.out.print("Unesite broj: ");
            number = s.nextInt();
            numbers.add(number);
        }

        System.out.print("Unesite X: ");
        int inputIndex = s.nextInt();
        System.out.print("Rezultat: Elementi niza A koji su jednaki broju " + inputIndex + " imaju indekse: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == inputIndex){
                System.out.print(i +", ");
            }
        }

    }
}
