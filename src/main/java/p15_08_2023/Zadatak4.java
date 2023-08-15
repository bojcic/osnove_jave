package p15_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
       // Napisati program koji na ekranu stampa podatke u formatu:
       // Sifra [SIFRA PROIZVODA]
       // [NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
       //  [BOJA], [VELICINA]

        String itemId = "x932k20";
        String itemName = "Nike Patike";
        int itemPrice = 90;
        double discount = 13.5;
        String color = "Crna";
        double size = 13.5;

        System.out.println("Šifra: " + itemId);
        System.out.println(itemName + " - $" + itemPrice + " - Popust: " + discount + "%");
        System.out.println(color + ", " + size);
    }
}
