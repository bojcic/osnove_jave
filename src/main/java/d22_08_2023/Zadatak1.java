package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.

        Scanner s = new Scanner(System.in);
        int sum = 0;
        boolean loop = true;

        while(loop){
            System.out.print("Unesite vrednost: ");
            int number = s.nextInt();
            if(sum + number <= 100){
                sum = sum + number;
            } else {
                loop = false;
                System.out.println("Prekoračenje! Kraj programa. Sracunata suma je " + sum + ".");
            }

        }



    }
}
