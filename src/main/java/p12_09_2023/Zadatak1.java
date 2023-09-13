package p12_09_2023;public class Zadatak1 {
    public static void main(String[] args) {
        Kartica superKartica = new Kartica("1234-9876", 10);
        Kupac vladimir = new Kupac("Vladimir Bojčić",superKartica);
        Proizvod sok = new Proizvod("Coca-Cola",0.75,vladimir);

        sok.printProduct();
        vladimir.printKupac();
    }
}
