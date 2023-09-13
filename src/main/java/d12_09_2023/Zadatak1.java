package d12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        FizickoLice vladimir = new FizickoLice("Vladimir Bojčić",123456789,false);
        vladimir.setIdCard(123321);
        FizickoLice marija = new FizickoLice("Marija Bojčić", 987654321, true);
        marija.setIdCard(789987);
        vladimir.printIndividual();
        marija.printIndividual();

        Ugovor contract = new Ugovor(13,9,2023,marija,vladimir);
        contract.setAddress("Norveška  8, Šabac");
        contract.setSellingPrice(120000);
        contract.printContract();

        Ugovor contract2 = new Ugovor(13,9,2023,vladimir,marija);
        contract2.setAddress("Norveška  8, Šabac");
        contract2.setSellingPrice(120000);
        contract2.printContract();
    }
}
