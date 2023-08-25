package d24_08_2023;

import java.util.ArrayList;

public class Zadatak6 {
    public static void main(String[] args) {
//        Napisati program koji vrsi proveru linkova sa stranice. Program cuva 3 niza:
//        niz linkova
//        niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
//        niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
//
//        Nizovi potrebni za ovaj primer:
//        linkovi
//        https://cms.demo.katalon.com/cart/
//        https://cms.demo.katalon.com/shop/
//        https://cms.demo.katalon.com/account/
//        https://cms.demo.katalon.com/cart/
//        https://cms.demo.katalon.com/test/
//        expected status codes
//        200
//        200
//        404
//        204
//        200
//        actual status codes
//        200
//        200
//        400
//        200
//        404
//        Program za svaki link vrsi proveru ocekivane i dobijene vrednosti za status kod. Ukoliko se actual i expected vrednosti ne poklapaju ispisati gresku u formatu:
//        Assertion Error: Link <link> expected status code <expected code> but got <actual code>
//        Primer izvrsenja:
//        Assertion Error: https://cms.demo.katalon.com/account/ expected 404 but got 400
//        Assertion Error: https://cms.demo.katalon.com/cart/ expected 204 but got 200
//        Assertion Error: https://cms.demo.katalon.com/test/ expected 200 but got 404

        ArrayList<String> links = new ArrayList<String>();
        ArrayList<Integer> expectedSCodes = new ArrayList<Integer>();
        ArrayList<Integer> actualSCodes  = new ArrayList<Integer>();
        links.add("https://cms.demo.katalon.com/cart/");
        links.add("https://cms.demo.katalon.com/shop/");
        links.add("https://cms.demo.katalon.com/account/");
        links.add("https://cms.demo.katalon.com/cart/");
        links.add("https://cms.demo.katalon.com/test/");
        expectedSCodes.add(200);
        expectedSCodes.add(200);
        expectedSCodes.add(404);
        expectedSCodes.add(204);
        expectedSCodes.add(200);
        actualSCodes.add(200);
        actualSCodes.add(200);
        actualSCodes.add(400);
        actualSCodes.add(200);
        actualSCodes.add(404);


        for (int i = 0; i < links.size(); i++) {
            int expected = expectedSCodes.get(i);
            int actual = actualSCodes.get(i);
            if (expected !=  actual){
                System.out.println("Assertion Error: " + links.get(i) + " expected " + expectedSCodes.get(i) + " but got " + actualSCodes.get(i));

            }

        }




    }
}
