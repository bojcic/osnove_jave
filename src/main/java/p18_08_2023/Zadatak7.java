package p18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10) i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
//        Primer izvrsenja;
//        Unesite jacinu zvuka: 8
//                < | | | | | | | |

        String level = "| ";
        System.out.print("Unesite jačinu od 0 do 10: ");
        int volume = s.nextInt();

        if (volume == 0){
            System.out.println("</ MUTE");
        } else {

            System.out.print("< ");
            for (int i = 0; i <= volume; i++) {
                System.out.print(level);

            }
        }

    }
}
