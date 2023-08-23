package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..

        Scanner s = new Scanner(System.in);
        boolean loop = true;

        while (loop){
            System.out.print("Unesite rimski broj: ");
            String romanNumber = s.next();
            if (romanNumber.equals("I")){
                System.out.println("Arapski: 1");

            } else if (romanNumber.equals("V")){
                System.out.println("Arapski: 5");

            } else if (romanNumber.equals("X")){
                System.out.println("Arapski: 10");

            } else if (romanNumber.equals("L")){
                System.out.println("Arapski: 50");

            } else if (romanNumber.equals("C")){
                System.out.println("Arapski: 100");

            } else if (romanNumber.equals("D")){
                System.out.println("Arapski: 500");

            } else if (romanNumber.equals("M")){
                System.out.println("Arapski: 1000");

            } else if (romanNumber.equals("KRAJ")){
                loop = false;
                System.out.println("Kraj programa");

            }
        }

    }
}
