package p21_08_2023;

import java.util.Scanner;

public class Zadatak8v {
    public static void main(String[] args) {
//        (Za vezbanje) Napisati program koji za sve petocifrene brojeve izvlaci sve cifre i stampa ih na ekranu.
//                Primer izvrsenja:
//        Unesite broj: 19452
//        2, 5, 4, 9, 1

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite petocifreni broj: ");
        int number = s.nextInt();
        int digit =0;

        for (int i = 0; i<5; i++){
            if (i==4){
                digit = number % 10;
                System.out.print(digit);
            }else {
                digit = number % 10;
                System.out.print(digit + ", ");
                number = number / 10;
            }
        }

    }
}
