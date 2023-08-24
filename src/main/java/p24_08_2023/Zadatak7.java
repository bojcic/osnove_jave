package p24_08_2023;

import java.util.ArrayList;

public class Zadatak7 {
    public static void main(String[] args) {
//        Napisati program koji simulira digitalni meni za pasta bar. Program ima dva niza informacija paste i cene.
//        Program stampa meni u formatu
//        naziv paste ………………………….cena rsd
//        Informacije su uparene po poziciji, to znaci da je:
//        pasta na poziciji 0, sa cenom sa pozicije 0
//        pasta na poziciji 1, sa cenom sa pozicije 1
//…..
//
//        Primer izvrsenja:
//        AGLIO E OLIO ………………… 500 rsd
//        PRIMAVERA…………………340 rsd
//        ARRABBIATA ………………….420 rsd
//        NAPOLITANA ………………….440 rsd
//        POLLO E SPINACI ………………….550 rsd
        ArrayList<Integer> prices = new ArrayList<Integer>();
        ArrayList<String> items = new ArrayList<String>();

        items.add("AGLIO E OLIO");
        items.add("PRIMAVERA");
        items.add("ARRABBIATA");
        items.add("NAPOLITANA");
        items.add("POLLO E SPINACI");

        prices.add(1000);
        prices.add(1312);
        prices.add(420);
        prices.add(120);
        prices.add(897);

        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i);
            int price = prices.get(i);

            System.out.println(item + "................" + price);

        }



    }
}
