package p17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Početak");

        System.out.print("Unesite A:");
        int a = s.nextInt();

        System.out.print("Unesite B:");
        int b = s.nextInt();

        System.out.print("Unesite C:");
        int c = s.nextInt();

        if (a>=b && a<=c) {
            System.out.println("A je u opsegu između " + b + " i " + c);
        }
        System.out.println("KRAJ");


    }
}
