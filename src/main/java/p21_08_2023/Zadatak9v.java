package p21_08_2023;

import java.util.Scanner;

public class Zadatak9v {
    public static void main(String[] args) {
//        (Za vezbanje) Napisati program koji za sve petocifene brojeve radi mirror opciju.
//        Primer izvrsenja:
//        Unesite broj: 32492
//        Novi broj je 29423

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite petocifreni broj: ");
        int number = s.nextInt();
        int numberNow = 0;
        int multiplyBy = 10000;
        int newNumber = 0;

        for (int i = 0; i < 5; i++) {
            numberNow = number%10;
            newNumber = newNumber + (numberNow * multiplyBy);
            multiplyBy = multiplyBy / 10;
            number = number / 10;
        }

        System.out.println("Nov broj je " + newNumber);

    }
}
