package testoviVezbanje;

import java.util.ArrayList;
import java.util.Scanner;

public class test2Zadatak3 {
//    Za potrebe loto igre na srecu, potrebno je napisati program koja ispisuje informaciju da li
//    je odigrana loto kombinacija upravo dobitna kombinacija. Korisnik unosi dva niza oba duzine
//7, prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu kombinaciju.
//    Program na kraju ispisuje da li je dobitna kombinacija.Primer poziva metoda:
//    Ako se unesu nizovi:
//            ● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena= {1,2 ,3, 7, 29, 30, 32}
//● Program stampa “Nije dobitna kombinacija”
//    Ako se metoda pozove za:
//            ● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena={1, 2, 3, 4, 5, 33, 29} vraca true.
//            ● Program stampa “Jeste dobitna kombinacija”
//    Napomena: Resenje preko petlje nosi maksimalni broj poena, dok resenje bez petlji nosi
//50% poena.
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList <Integer> ticketCombination = new ArrayList<>();
    ArrayList <Integer> winnerCombination = new ArrayList<>();
    for (int i = 0; i < 7; i++) {
        System.out.print("Unesite odigran broj " + (i+1) + "/7: ");
        int number = s.nextInt();
        ticketCombination.add(number);
    }
    for (int i = 0; i < 7; i++) {
        System.out.print("Unesite pobednički broj " + (i+1) + "/7: ");
        int number = s.nextInt();
        winnerCombination.add(number);
    }

    if (comparing(ticketCombination,winnerCombination)){
        System.out.println("Čestitamo! Imate dobitnu kombinaciju!");
    } else {
        System.out.println("Nažalost, odigrana kombinacija nije dobitna.");
    }
}
public static Boolean comparing (ArrayList <Integer> ticketCombination, ArrayList <Integer> winnerCombination){
    if (ticketCombination.containsAll(winnerCombination)) {
        return true;
    } else {
        return false;
    }
}

}
