package d17_08_2023;

import java.util.Scanner;

public class Zadatak8v_slack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//  Tea Tairovic je zatrazila od svojih najvernijih fanova ako mogu da joj izadju u susret i razviju softver
//  za njene potrebe. Najveci fan Veljko se javio i iz razgovora je izvukao sta je potrebno da softver radi.
//  Posto je izbacila 3 najveca hita, potrebno joj je da sracuna zaradu od pregleda na youtubu.
//  Tea zaradjuje $1 na 1000 pregleda.
//  Dok ne dodje do 50k pregleda, sve sto se zaradi sa youtube-a ostaje njoj.
//  Ukoliko ima od 50k do 100k pregleda njen mendzer joj uzima fiksno $50, a sve preko 100k pregleda dele po pola.
//  Program sa tastature ucitava ukupan broj pregleda jednog videa i ispisuje koliko ce Tea zaraditi od njega.
//***Sva imena likova u ovom zadatku su izmišljena. Svaka sličnost sa stvarnim osobama je slucajna i nenamerna. :joy:

        int zarada = 0;

        System.out.print("Unesite broj pregleda za pesmu 'Hajde': ");
        int song1 = s.nextInt();

        if (song1 < 50000) {
            zarada = zarada + (song1/1000);
        } else if (song1 < 100000) {
            zarada = zarada + (song1/1000) - 50;
        } else {
            zarada = zarada + ((song1/1000)/2);
        }
        System.out.println("Zarada za prvu pesmu je: " + zarada);


        System.out.print("Unesite broj pregleda za pesmu 'Jednu noć': ");
        int song2 = s.nextInt();

        if (song2 < 50000) {
            zarada = zarada + (song2/1000);
        } else if (song2 < 100000) {
            zarada = zarada + (song2/1000) - 50;
        } else {
            zarada = zarada + ((song2/1000)/2);
        }
        System.out.println("Zarada za prve dve pesme je: " + zarada);

        System.out.print("Unesite broj pregleda za pesmu 'Dva i dva': ");
        int song3 = s.nextInt();

        if (song3 < 50000) {
            zarada = zarada + (song3/1000);
        } else if (song3 < 100000) {
            zarada = zarada + (song3/1000) - 50;
        } else {
            zarada = zarada + ((song3/1000)/2);
        }
        System.out.println("Zarada za sve tri pesme je: " + zarada);







    }
}
