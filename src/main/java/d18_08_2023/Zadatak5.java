package d18_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//  Napisati program koji stampa sve brojeve od 1 do 100 tako da:
//  sve parne stampa kao negativne
//  sve neprane kao pozitivne brojeve
//  Primer izvrssenja:
//  0, 1, -2, 3, -4, 5, -6, ……..

        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                System.out.print("-"+i + ", ");
            } else {
                System.out.print(i + ", ");
            }
        }



    }
}
