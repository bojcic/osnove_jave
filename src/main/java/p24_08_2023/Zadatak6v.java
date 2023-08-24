package p24_08_2023;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak6v {
    public static void main(String[] args) {
//        (Za vezbanje) Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva.
//                Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
//        primer jedne zamene:
//        Ako je niz
//        1,2,3,4,5,6,7,8,9,10
//        i prvi random indeks je 4 a drugi random indeks je 6
//        1,2,3,4,7,6,5,8,9,10
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();

        numbers.add(111);
        numbers.add(85);
        numbers.add(98);
        numbers.add(4);
        numbers.add(7);
        numbers.add(15);
        numbers.add(96);
        numbers.add(52);
        numbers.add(32);
        numbers.add(10);

        for (int i = 0; i < 8; i++) {
            int randomX =random.nextInt(numbers.size()-1);
            int randomY =random.nextInt(numbers.size()-1);

            int positionX = randomX;
            int positionY = randomY;

            int valueX= numbers.get(positionX);
            int valueY = numbers.get(positionY);

            numbers.set(randomX,valueY);
            numbers.set(randomY,valueX);

        }

    }
}
