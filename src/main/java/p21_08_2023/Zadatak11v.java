package p21_08_2023;

import java.util.Scanner;

public class Zadatak11v {
    public static void main(String[] args) {
//        (ZA VEZBANJE)Napisati program prikazuje koliko je svaki od unetih passworda jak. Korisnik unosi N passworda
//        i za svaki se ispisuje jacina.
//        Svaki uslov koji password ispunjava dodaje po 1 poen:
//        duzina veca od 8
//        sadrzi @ specijalan karakter
//
//        Primer izvrsenja:
//        Unesite N: 3
//        Unesite password: passwdr
//        Password ima 0 poena.
//                Unesite password: password123
//        Password ima 1 poena.
//                Unesite password: password@123
//        Password ima 2 poena.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int counter = s.nextInt();




        for (int i = 0; i<counter; i++){

            System.out.print("Unesite password: ");
            String pass = s.next();
            int lenght = pass.length();
            int strenght =0;

            if (pass.contains("@")){
                strenght = strenght + 1;
            } if (lenght>=8){
                strenght =strenght + 1;
            }

            System.out.println("Password ima " + strenght + " poena");
        }




    }
}
