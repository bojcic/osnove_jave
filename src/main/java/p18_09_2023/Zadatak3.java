package p18_09_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Figura> figure = new ArrayList<>();
        figure.add(new JednakostranicniTrougao(5));
        figure.add(new JednakostranicniTrougao(12));
        figure.add(new Pravougaonik(7,2));
        figure.add(new Pravougaonik(7,2));
        figure.add(new Pravougaonik(7,2));

        double pTotal=0;
        double oTotal=0;

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
            pTotal+=figure.get(i).povrsina();
            oTotal+=figure.get(i).obim();
            if (i== figure.size()-1){
                System.out.println("Ukupna površina je " + pTotal);
                System.out.println("Ukupni obim je " + oTotal);
            }

        }
    }
}
