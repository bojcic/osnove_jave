package miniProjekat;

import java.util.ArrayList;

public class Zadatak2 {
//    **Zadatak: Simulacija iscrtavanja korisnika na Slacku**
//
//    Napišite program koji simulira prikazivanje korisnika na Slacku. Prikaz korisnika treba da se izvede tako da prvo budu prikazani aktivni korisnici, a potom neaktivni. Program će čuvati sledeće informacije:
//    Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
//    Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan. Informacije o aktivnostima biće čuvane u nizu gde će za svakog korisnika biti zabeleženo da li je trenutno aktivan ili ne  (true ili false).. Naravno, korisnik i njegova aktivnost će biti upareni po istom indeksu. To znači da će se za korisnika na poziciji N u nizu "korisnici" čitati aktivnost sa pozicije N u nizu "aktivnosti".
//
//    Program će ispisivati informacije za svakog korisnika na sledeći način:
//    Za aktivne korisnike:
//            | slika |o Ime Prezime
//    Za neaktivne korisnike:
//            | slika |x Ime Prezime
//
//    Na primer, ako je niz korisnika:
//    Pera Peric
//    Darko Darkovic
//    Marko Markovic
//    Stefan Stefanovic
//    Uros Urosevic
//    Milan Milanovic
//
//    I ako su aktivnosti korisnika:
//
//            true
//            false
//            true
//            true
//            false
//            true
//
//    Program treba da ispiše:
//
//            | slika |o Pera Peric
//| slika |o Marko Markovic
//| slika |o Stefan Stefanovic
//| slika |o Milan Milanovic
//| slika |x Darko Darkovic
//| slika |x Uros Urosevic

    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();
        ArrayList<Boolean> active = new ArrayList<Boolean>();

        users.add("Mikelanđelo");
        users.add("Donatelo");
        users.add("Rafaelo");
        users.add("Leonardo");
        users.add("Splinter");
        users.add("Ejpril");

        active.add(true);
        active.add(false);
        active.add(true);
        active.add(true);
        active.add(false);
        active.add(true);

        for (int i = 0; i < users.size(); i++) {
            if (active.get(i)){
                System.out.println("| slika |o " + users.get(i));
            }
        }
        for (int i = 0; i < users.size(); i++) {
            if (!active.get(i)){
                System.out.println("| slika |x " + users.get(i));
            }
        }


    }

}
