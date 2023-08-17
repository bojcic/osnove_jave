package p17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Početak");

        System.out.print("Unesite A:");
        int a = s.nextInt();

        System.out.print("Unesite B:");
        int b = s.nextInt();

        if (a>b) {
            System.out.println("B je manje od A");
        }
        System.out.println("KRAJ");




    }
}
