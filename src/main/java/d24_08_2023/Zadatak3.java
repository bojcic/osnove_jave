package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//                Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        int numberWorking = numbers.size() - 1;

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(numberWorking);
            numberWorking = numberWorking - 1;
            System.out.print(number + ", ");
        }









    }
}
