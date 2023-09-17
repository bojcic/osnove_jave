package p14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Pasta carbonara = new Pasta();
        carbonara.addIngredient(new Sastojak("Jaja",15.99));
        carbonara.addIngredient(new Sastojak("Slanina",350.99));
        carbonara.addIngredient(new Sastojak("Parmezan",120.99));

        carbonara.printPasta();
        System.out.println("Ukupna cena: " + carbonara.pricePasta());
        carbonara.deleteIngredient("Slanina");
        carbonara.printPasta();
        System.out.println("Ukupna cena: " + carbonara.pricePasta());

    }
}
