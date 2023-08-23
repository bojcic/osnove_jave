package p22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji simulira ponasanje jednog test case-a. Test case ima 5 provera, a program validira jednu
//        po jednu proveru sve dok ne proveri sve ili dok neka provera ne failuje. Korisnik sa tastature za svaku proveru
//        unosi expected rec i actual rec. U slucaju fail-a ispisati odgovarajucu poruku.
//                Primer izvrsenja 1:
//        Unesite expected: hello
//        Unesite actual: hello
//        Unesite expected: hello1
//        Unesite actual: hello1
//        Unesite expected: hello2
//        Unesite actual: hello
//        Test failed: Expected hello2 but got hello.
//
//                Primer izvrsenja 2:
//        Unesite expected: hello
//        Unesite actual: hello
//        Unesite expected: hello1
//        Unesite actual: hello1
//        Unesite expected: hello2
//        Unesite actual: hello2
//        Unesite expected: hello3
//        Unesite actual: hello3
//        Unesite expected: hello4
//        Unesite actual: hello4
//        Unesite expected: hello5
//        Unesite actual: hello6
//        Test passed.

        Scanner s = new Scanner(System.in);
        String expected = "";
        String actual = "";
        boolean active = true;

        int testNumber = 0;

        while (active == true && testNumber <5){
            System.out.print("Unesite expected: ");
            expected = s.next();

            System.out.print("Unesite actual: ");
            actual = s.next();

            testNumber++;

            if (!expected.equals(actual)){
                active=false;
                System.out.println("Test failed: Expected "+ expected +" but got " + actual + ".");
            }

            if (active==true && testNumber==5 ){
                System.out.println("Test passed!");
            }


        }

    }
}
