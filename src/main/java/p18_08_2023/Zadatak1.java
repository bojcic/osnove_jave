package p18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji sa tastature ucitava broj N i operaciju koja se izvrsava nad njim.
//        Na kraju programa se ispisuje nova vrednost promenljive N.
//                Ukoliko se za operaciju unese uvecaj, to uvecava promenljivu N za 1.
//        Ukoliko se za operaciju unese smanji, to smanjuje promenljivu N za 1.

        System.out.print("Unesite broj N:");
        int number = s.nextInt();

        System.out.print("Unesite operaciju uvećaj/smanji:");
        String operacija = s.next();

        if (operacija == "uvećaj") {
            number = number + 1;
        } else if (operacija == "umanji") {
            number = number - 1;

        }

        System.out.println("Nova vrednost je " + number);


    }
}
