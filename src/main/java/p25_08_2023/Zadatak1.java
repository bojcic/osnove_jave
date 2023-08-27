package p25_08_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati metodu koja stampa ime i prezime i u glavnom programu pozvati metodu na izvrsenje 5 puta.
        for (int i = 0; i < 5; i++) {
            printFullName();
        }


    }

    public static void printFullName() {
        System.out.println("Vladimir Bojčić");


    }
}
