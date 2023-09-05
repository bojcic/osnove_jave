package testoviVezbanje;

import java.util.ArrayList;
import java.util.Scanner;

public class test1Zadatak2 {
    //    Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli. Program
//    ima niz brojeva duzine 25, koji izgleda kao tabela 5x5, niz je sa fiksnim vrednostima
//    tj. ne unosi ih korisnik. Program stampa tabelu na ekranu a zatim od korisnika trazi
//    da unese kolonu po kojoj bi zeleo da sumira vrednosti i na kraju programa ispisuje
//    sumu za trazenu kolonu.
//    Primer izvrsenja:
//            3,1,8,0,1,
//            1,5,7,9,6,
//            3,1,6,5,1,
//            4,5,8,1,7,
//            1,3,2,8,0,
//    Unesite kolonu za sumiranje: 2
//    Suma je 31 (Objasnjenje: jer se sumira 8+7+6+8+2, pogledaj sliku)

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();
        values.add(3); values.add(1); values.add(8); values.add(0); values.add(1);
        values.add(1); values.add(5); values.add(7); values.add(9); values.add(6);
        values.add(3); values.add(1); values.add(6); values.add(5); values.add(1);
        values.add(4); values.add(5); values.add(8); values.add(1); values.add(7);
        values.add(1); values.add(3); values.add(2); values.add(8); values.add(0);

        for (int i = 0; i < values.size(); i++) {
            int place = i + 1;
            if (place % 5 == 0) {
                System.out.println(values.get(i));
            } else {
                System.out.print(values.get(i) + ", ");
            }
        }

        System.out.print("Unesite kolonu za sumiranje: ");
        int column = s.nextInt();
        int sum = 0;
        int calucalting = column;

        for (int i = 0; i < 5; i++) {
            int place = calucalting - 1;
            sum += values.get(place);
            calucalting +=5;

        }

        System.out.println("Suma u koloni " + column + " je " + sum + ".");




    }
}
