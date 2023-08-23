package p22_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        Napisati program koji radi bipovanje ruznih reci. Program radi za jednu recenicu, sto znaci da ucitava od
//        korisnika rec po rec sve dok se ne unese rec sa tackom. Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
//                Ruzne reci koje program prepoznaje su:
//        zajebava
//                mars
//        stoko
//                svinjo
//        Unesite rec: Jel
//                Jel
//        Unesite rec:ti
//                ti
//        Unesite rec:to
//                to
//        Unesite rec:mene
//                mene
//        Unesite rec:zajebavas
//                beeeeeeeeeep
//        Unesite rec:stoko
//                beeeeeeeeeep
//        Unesite rec:jedna.
//                jedna.
//                Kraj programa.

        Scanner s = new Scanner(System.in);


        String word1 = "mars";
        String word2 = "stoko";
        String word3 = "svinjo";
        String word4 = "zajebava";
        boolean active = false;

        while (!active){
            System.out.print("Unesite rec: ");
             String rec = s.next();
             if (rec.contains("svinjo") || rec.contains("mars") || rec.contains("stoko") || rec.contains("zajebava")){

                 System.out.println("Beeeeep");

             }else {
                 System.out.println(rec);
             }

             if (rec.contains(".")) {
                 active = true;
             }

        }




    }
}
