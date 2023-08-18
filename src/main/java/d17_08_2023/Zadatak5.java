package d17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//  Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
//  (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu odgovarajuci zbir, razliku,
//  proizvod ili kolicnik za dva broja a i b uneta sa tastature.

        System.out.print("Unesite broj a: ");
        int a = s.nextInt();

        System.out.print("Unesite broj b: ");
        int b = s.nextInt();

        System.out.print("Unesite operator: ");
        String operator = s.next();

        int zbir = a + b;
        int razlika = a - b;
        int proizvod = a * b;
        int kolicnik = a / b;

        if ( operator.equals("+")) {
            System.out.println("Rezultat: "  + zbir);
        }
        else if (operator.equals("-")) {
            System.out.println("Rezultat: " + razlika);
        }
        else if (operator.equals("*")){
            System.out.println("Rezultat: " + proizvod);
        }
        else if (operator.equals("/")){
            System.out.println("Rezultat: " + kolicnik);
        }
        else {
            System.out.println("Niste uneli ispravan operator");
        }



//          DONE


    }
}
