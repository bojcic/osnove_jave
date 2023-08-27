package d25_08_2023;

import java.util.Scanner;

public class Zadatak7 {
//    Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi funkciju i
//    ispisti odgovarajucu poruku.
//
//    Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//    Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Unesite prvi broj: ");
    int a = s.nextInt();
    System.out.print("Unesite drugi broj: ");
    int b = s.nextInt();
    System.out.print("Unesite treći broj: ");
    int c = s.nextInt();

    System.out.println("Od unetih brojeva, najmanji je " + min(a,b,c));

}
public static int min (int a, int b, int c){
    if (a<b && a<c){
        return a;
    } else if (b < a && b < c) {
        return b;

    } else {
        return c;
    }

}
}
