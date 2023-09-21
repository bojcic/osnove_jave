package p19_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        PoreskaUprava first = new PoreskaUprava("Beograd");
        first.addObjekat(new Zgrada("Bulevar oslobođenja 137",2500,2,25));
        first.addObjekat(new Zgrada("Bulevar oslobođenja 137",1500,1,13));
        first.addObjekat(new Lokal("Ive Andrića 28", 85.5,3));
        first.addObjekat(new Lokal("Vase Čarapića 2", 50,1));
        first.addObjekat(new Kuca("Norveška 25/13", 120,1,4));

        first.print();

        System.out.println("Najveći porez: " + first.highTax().tax());
        System.out.println("Najmanji porez: " + first.lowTax().tax());
        System.out.println("Ukupan porez: " + first.totalTax());


    }
}
