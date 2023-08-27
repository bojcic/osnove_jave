package d25_08_2023;

import java.util.Scanner;

public class Zadatak4 {
//    Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//    Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//    Napomena: Metoda nista ne vraca.
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Unesite N: ");
    int repeat = s.nextInt();
    System.out.print("Unesite karakter: ");
    String character = s.next();
    print(repeat, character);



}

    public static void print(int repeat, String character){
        for (int i = 0; i < repeat; i++) {
            System.out.print(character + " ");
        }

    }

}
