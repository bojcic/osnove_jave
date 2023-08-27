package p25_08_2023;

public class Zadatak6 {
//    Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//    Primer: Ako se metoda pozove za N=10, vraca -10
//    Ako se metoda pozove za N=-11, vraca 11
public static void main(String[] args) {
    int m = 10;
    int n = -5;

    int p= obrni(m);
    int r= obrni(n);

    System.out.println("M je " + m + ", P je " + p);
    System.out.println("N je " + n + ", R je " + r);

}
public static int obrni (int n){
    int x = n * -1;
    return x;

}
}
