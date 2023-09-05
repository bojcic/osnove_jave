package testoviVezbanje;

import java.util.Scanner;

public class test2Zadatak2 {
    //    Napisati program koji učitava brojeve od korisnika dok ne unese dve nule
//    zaredom.Na kraju programa ispisati sumu unetih brojeva.
//    Primer izvršenja 1:
//    Unesite broj: 1
//    Unesite broj: 1
//    Unesite broj: 3
//    Unesite broj: 5
//    Unesite broj: 9
//    Unesite broj: 0
//    Unesite broj: 0
//    Suma je 19
//    Primer izvrsenja 2:
//    Unesite broj: 1
//    Unesite broj: 1
//    Unesite broj: 0
//    Unesite broj: 1
//    Unesite broj: 0
//    Unesite broj: 9
//    Unesite broj: 0
//    Unesite broj: 0
//    Suma je 12

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        boolean loop = true;
        String checking = "";

        while (loop){
            System.out.print("Unesite broj: ");
            int number = s.nextInt();
            sum += number;
            checking += number;
            if (checking.contains("00")) {
                loop = false;
            }
        }
        System.out.println("Suma je " + sum );

    }
}
