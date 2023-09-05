package testoviVezbanje;

import java.util.Scanner;

public class test1Zadatak3 {
    //    Napisati program koji validira unos lozinke sve dok korisnik ne unese validnu.
//    Lozinka je validna ukoliko ima minimum 8 karaktera i sadrzi bar jedan od dva
//    specijalna karaktera a specijalni karakteri su @ i #
//    Primer izvrsenja:
//    Unesite lozinku: ITBootcamp
//    Lozinka nije validna.
//    Unesite lozinku: ITBootcamp12
//    Lozinka nije validna.
//    Unesite lozinku: ITBoo@
//    Lozinka nije validna.
//    Unesite lozinku: ITBootcamp@
//    Lozinka je validna.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean loop = true;

        while (loop){
            System.out.print("Unesite lozinku: ");
            String password = s.next();
            if (password.length() >= 8 && password.contains("@")){
                loop = false;
            } else if (password.length() >= 8 && password.contains("#")) {
                loop = false;
            } else {
                System.out.println("Lozinka nije validna.");
            }
        }
        System.out.println("Lozinka je validna");

    }
}
