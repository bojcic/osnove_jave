package p25_08_2023;

public class Zadatak7 {
//    Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//    Trougao je pravougli ukoliko je a*a+b*b=c*c
//

public static void main(String[] args) {
    int x=3, y=7, z=5;

    boolean t = daLiJePravougli(x,y,z);

    if (t == true){
        System.out.println("Trougao je pravougli");
    } else {
        System.out.println("Trougao nije pravougli");
    }


}
public static boolean daLiJePravougli(int a, int b, int c){
    boolean trougli = true;
    if (a*a + b*b == c*c){
        trougli=true;
    } else {
        trougli=false;
    }
    return trougli;

}
}
