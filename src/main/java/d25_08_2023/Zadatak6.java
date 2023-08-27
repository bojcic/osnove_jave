package d25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
//    Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//    Primer izvrsenja:
//    izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//    izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Unesite granicu A: ");
    int borderFrom = s.nextInt();
    System.out.print("Unesite granicu B: ");
    int borderTo = s.nextInt();

    System.out.println("Između " + borderFrom + " i " + borderTo + " ima " + count(borderFrom,borderTo) + " celih brojeva");

}
public static int count (int borderFrom, int borderTo){
    int counter =0;
    for (int i = borderFrom + 1; i < borderTo; i++) {
        counter++;
    }
    return counter;
}

}
