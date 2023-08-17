package p17_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

// Napisati program koji sa tastature ucitava tri cela broja:
//  dan mesec godina
//I formira datum u ispisu u formatu dan-mesec-godina

        System.out.print("Unesite dan: ");
        int dd = s.nextInt();

        System.out.print("Unesite mesec: ");
        int mm = s.nextInt();

        System.out.print("Unesite godinu: ");
        int yyyy = s.nextInt();

        System.out.println(dd + "-" + mm + "-" + yyyy);







    }
}
