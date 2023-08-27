package d25_08_2023;

public class Zadatak2 {
//    Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira
//    kao na primeru. METODA NISTA NE STAMPA.
//    ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//    ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
public static void main(String[] args) {
    int a = 2, b=6;
    System.out.println("Nova vrednost je " + zalepi(a,b));

    a = 8; b=7;
    System.out.println("Nova vrednost je " + zalepi(a,b));

    a = 6; b=1;
    System.out.println("Nova vrednost je " + zalepi(a,b));

}
public static int zalepi (int a, int b){
    int c = a * 10 + b;
    return c;
}
}
