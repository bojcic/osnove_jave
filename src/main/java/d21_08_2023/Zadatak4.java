package d21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        like
//                smile
//        heart
//
//        Primer izvrsenja:
//        Unesite N: 7
//        Reaguj: like
//        Reaguj: heart
//        Reaguj: smile
//        Reaguj: lol
//        Reaguj: smile
//        Reaguj: like
//        Reaguj: like
//        Summary: like 3 | smile 2 | heart 1
//
//        Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
//
//        POMOC: Svaka promenljiva nosi jednu informaciju, to znaci evidenciju za like cuva promelniva sa imenom npr likeCounter, evidenciju za smile cuva smileCounter i za heart cuva promenljiva heartCounter

        Scanner s = new Scanner(System.in);

        int counterLike = 0;
        int counterSmile = 0;
        int counterHeart = 0;
        System.out.println("Program podržava reakcije:   like   smile   heart");
        System.out.print("Unesite N: ");
        int limit = s.nextInt();

        for (int i = 0; i < limit; i++) {
            System.out.print("Reaguj: ");
            String word = s.next();
            if (word.equals("like")){
                counterLike++;
            } else if (word.equals("smile")){
                counterSmile++;
            }else if (word.equals("heart")){
                counterHeart++;
            }

        }

        System.out.println("Summary: like " + counterLike + " | smile " + counterSmile + " | heart " + counterHeart);




    }
}
