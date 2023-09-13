package d12_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Racun vladimir = new Racun("170-0000052236-45", "Vladimir Bojčić");
        Racun marija = new Racun("170-00000036524-78", "Marija Bojčić");
        vladimir.deposit(1000);
        marija.deposit(100);
        vladimir.printAccount();
        marija.printAccount();
        System.out.println();
        Transakcija first = new Transakcija(1,vladimir,marija,200);
        first.printTransaction();
        vladimir.printAccount();
        marija.printAccount();

        Transakcija second = new Transakcija(2,marija,vladimir,200);
        second.printTransaction();
        vladimir.printAccount();
        marija.printAccount();

    }
}
