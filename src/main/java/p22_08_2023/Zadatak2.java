package p22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
//                Primer:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:1
//        Unesite broj:0
//        Kraj programa jer je uneto 2 nule.
        Scanner s = new Scanner(System.in);
        int counter = 0;
        int number = 0;
        boolean zeroLimit = false;

        while (zeroLimit == false){
            System.out.print("Unesite broj: ");
             number= s.nextInt();
            if (number == 0){
                counter = counter + 1;
            }
            if (counter==2){
                zeroLimit=true;
                System.out.println("Kraj programa jer je uneto 2 nule.");
            }
        }



    }
}
