package testoviVezbanje;

import java.util.Scanner;

public class test2Zadatak1 {
    //    Napisati program koji za unetu visinu i težinu osobe računa indeks telesne
//    mase (BMI) i na osnovu tog rezultata osobu raspoređuje u jednu od četiri kategorije.
//    BMI se računa po formuli
//            𝐵𝑀𝐼 = 𝑡𝑒𝑧𝑖𝑛𝑎 𝑢 𝑘𝑔
//            (𝑣𝑖𝑠𝑖𝑛𝑎 𝑢 𝑚)2
//    dok se kategorija određuje prema tabeli 1.1.
//    Tabela 1.1 Određivanje kategorije na osnovu indeksa telesne mase
//    Primer izvrsenja: Unesite tezinu osobe (kg): 110
//    Unesite visinu osobe (m): 1.9
//    Kategorija je Gojaznost

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite težinu osobe (kg): ");
        double weight = s.nextDouble();

        System.out.print("Unesite visinu osobe (m): ");
        double height = s.nextDouble();

        double bmi = weight / (height*height);

        if (bmi < 18.5){
            System.out.print("Osoba je NEUHRANJENA");
        } else if (bmi <= 24.99) {
            System.out.print("Osoba je NORMALNE TEŽINE");
        } else if (bmi <= 29.99) {
            System.out.print("Osoba je PREKOMERNO TEŠKA");
        } else {
            System.out.print("Osoba je GOJAZNA");
        }


    }
}
