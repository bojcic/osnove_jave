package d17_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//  Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2) Ukoliko se za b unese:
//  b=1, vrednost promenljive a se uvecava za 10
//  b=2, vrednost promenljive a se smanjuje za 20
//  Na kraju zadatka odstampati novu vrednost promenljive a.
//  Primer izvrsenja:
//  Unesite a: 44
//  Unesite b: 2
//  Nova vrednost za a je 24

        System.out.print("Unesite broj a: ");
        int a = s.nextInt();

        System.out.print("Za broj b unesite vrednost 1 ili vrednost 2: ");
        int b = s.nextInt();

        if (b == 1) {
             a = a + 10;
        } else if (b == 2) {
             a = a - 20;

        } else {
            System.out.println("Neuspešno! Za vrednost b unesite 1 ili 2!");
        }

        System.out.println("Nova vrednost za a je " + a);



        //          DONE


    }
}
