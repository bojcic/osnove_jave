package d15_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
//    Kreirati klasu Osoba koja ima:
//    ime i prezime
//            jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//            (ime i prezime), (jmbg), (godina rodjenja)
//
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//    Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//    godine iskustva
//    tip trenera (kondicioni, za igru, pomocni, personalni)
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//    U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera,
//    na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Coach> coaches = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.print("Unesite ime igrača " + (i+1) + ": ");
            String firstName = s.next();
            System.out.print("Unesite prezime igrača " + (i+1) + ": ");
            String lastName = s.next();
            String fullName = firstName + " " + lastName;
            System.out.print("Unesite jmbg igrača " + (i+1) + ": ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rođenja igrača " + (i+1) + ": ");
            int birthYear = s.nextInt();
            System.out.print("Unesite broj na leđima igrača " + (i+1) + ": ");
            int number = s.nextInt();
            System.out.print("Unesite poziciju igrača " + (i+1) + ": ");
            String position = s.next();
            System.out.print("Da li je igrač " + (i+1) + " kapiten (true/false): ");
            boolean captain = s.nextBoolean();
            players.add(new Player(fullName,jmbg,birthYear,number,position,captain));
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.print("Unesite ime trenera " + (i+1) + ": ");
            String firstName = s.next();
            System.out.print("Unesite prezime trenera " + (i+1) + ": ");
            String lastName = s.next();
            String fullName = firstName + " " + lastName;
            System.out.print("Unesite jmbg trenera " + (i+1) + ": ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rođenja trenera " + (i+1) + ": ");
            int birthYear = s.nextInt();
            System.out.print("Unesite broj godina iskustva koje trener " + (i+1) + " ima: ");
            int experience = s.nextInt();
            System.out.print("Unesite tip trenera " + (i+1) + ": ");
            String type = s.next();

            coaches.add(new Coach(fullName,jmbg,birthYear,experience,type));
        }
        System.out.println();

        for (int i = 0; i < players.size(); i++) {
            players.get(i).print();
        }
        for (int i = 0; i < coaches.size(); i++) {
            coaches.get(i).print();
        }
    }
}
