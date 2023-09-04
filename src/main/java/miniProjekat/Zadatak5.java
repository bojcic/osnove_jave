package miniProjekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    //    **Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//    Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//    Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//            generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//            generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//            Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//    Glavni program:
//            - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//            - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
//    Primer izvršenja 1:
//    Unesite dužinu passworda: 10
//    Da li želite da sadrži specijalan karakter: true
//    Generisan password: eD9Kx0e@
//
//    Primer izvršenja 2:
//    Unesite dužinu passworda: 10
//    Da li želite da sadrži specijalan karakter: false
//    Generisan password: eCxdwEeFEx
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dužinu passworda: ");
        int passwordLength = s.nextInt();

        System.out.print("Da li želite da sadrži specijalan karakter (true/false): ");
        boolean specialCharacter = s.nextBoolean();

        System.out.print("Generisan password: " + generatePassword(passwordLength, specialCharacter));


    }

    public static String generateCharacter() {
        Random random = new Random();
        ArrayList<String> characters = new ArrayList<String>();
        characters.add("A");
        characters.add("a");
        characters.add("0");
        characters.add("B");
        characters.add("b");
        characters.add("1");
        characters.add("C");
        characters.add("c");
        characters.add("2");
        characters.add("D");
        characters.add("d");
        characters.add("3");
        characters.add("E");
        characters.add("e");
        characters.add("4");
        characters.add("F");
        characters.add("f");
        characters.add("5");
        characters.add("G");
        characters.add("g");
        characters.add("6");
        characters.add("H");
        characters.add("h");
        characters.add("7");
        characters.add("I");
        characters.add("i");
        characters.add("8");
        characters.add("J");
        characters.add("j");
        characters.add("9");
        characters.add("K");
        characters.add("k");
        characters.add("L");
        characters.add("l");
        characters.add("M");
        characters.add("m");
        characters.add("N");
        characters.add("n");
        characters.add("O");
        characters.add("o");
        characters.add("P");
        characters.add("p");
        characters.add("Q");
        characters.add("q");
        characters.add("R");
        characters.add("r");
        characters.add("S");
        characters.add("s");
        characters.add("T");
        characters.add("t");
        characters.add("U");
        characters.add("u");
        characters.add("V");
        characters.add("v");
        characters.add("W");
        characters.add("w");
        characters.add("X");
        characters.add("x");
        characters.add("Y");
        characters.add("y");
        characters.add("Z");
        characters.add("z");

        return characters.get(random.nextInt(characters.size()));

    }

    public static String generateSpecialCharacter() {
        Random random = new Random();
        ArrayList<String> specialCharacters = new ArrayList<String>();

        specialCharacters.add("@");
        specialCharacters.add("#");
        specialCharacters.add("&");
        specialCharacters.add("*");
        specialCharacters.add("!");

        return specialCharacters.get(random.nextInt(specialCharacters.size()));

    }

    public static String generatePassword(int passwordLength, boolean specialCharacter) {
        String fullPassword = "";

        for (int i = 0; i < passwordLength - 1; i++) {
            fullPassword += generateCharacter();
        }
        if (specialCharacter) {
            fullPassword += generateSpecialCharacter();
        } else {
            fullPassword += generateCharacter();
        }
        return fullPassword;
    }

}
