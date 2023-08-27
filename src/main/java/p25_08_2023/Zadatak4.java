package p25_08_2023;

public class Zadatak4 {
//    Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni
//    parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.

    public static void main(String[] args) {
        print(2,3);
        print(5, 8);
        print(7, 13);
        print(52, 105);


    }
    public static void print (int x, int y){
        System.out.println("Zbir je " + (x+y) + ". Razlika je " + (x-y) + ". Proizvod je " + (x*y) + ". Količnik je " + (x/y));

    }
}
