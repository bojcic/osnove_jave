package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7v {
    public static void main(String[] args) {

//        (Za vezbanje) Napisati program koji ucitava niz a duzine N. Nakon unosa niza a, formira se niz b tako sto se
//        prva 3 elementa niza a kopiraju u niz b,
//                a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//
//
//        Unesite N: 6
//        Unesite broj: 1
//        Unesite broj: 5
//        Unesite broj: 2
//        Unesite broj: 7
//        Unesite broj: 8
//        Unesite broj: -1
//
//        Niz a: 1, 5, 2, 7, 8, -1
//        Niz b: 1, 5, 2, 1, 1, 1
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        ArrayList<Integer> secondList  = new ArrayList<Integer>();

        System.out.print("Unesite N: ");
        int repeat = s.nextInt();

        for (int i = 0; i < repeat; i++) {
            System.out.print("Unesite broj: ");
            int number = s.nextInt();
            inputList.add(number);
        }
        for (int i = 0; i < repeat; i++) {
            if(i<3) {
                int number = inputList.get(i);
                secondList.add(number);
            } else {
                int number = 1;
                secondList.add(number);
            }
        }

        System.out.println("Niz a je: " + inputList);
        System.out.println("Niz b je : " + secondList);


    }
}
