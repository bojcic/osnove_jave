package p12_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Sastojak> spices = new ArrayList<>();

        spices.add(new Sastojak("Jaja",19.99));
        spices.add(new Sastojak("Mleko",209.99));
        spices.add(new Sastojak("Prašak za pecivo",11.99));

        System.out.print("Unesite broj sastojaka: ");
        int number = s.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print("Unesite naziv sastojka: ");
            String newSpiceName = s.next();
            System.out.print("Unesite cenu sastojka: ");
            double newPrice = s.nextDouble();
            spices.add(new Sastojak(newSpiceName,newPrice));
        }

        for (int i = 0; i < spices.size(); i++) {
            System.out.println(spices.get(i).getSpiceName() + " - " + spices.get(i).getSpicePrice());
        }


    }
}
