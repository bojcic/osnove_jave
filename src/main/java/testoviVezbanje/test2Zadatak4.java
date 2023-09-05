package testoviVezbanje;

import java.util.Scanner;

public class test2Zadatak4 {
//    Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj
//    konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno
//    izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
//    U glavnom programu pozvati funkciju za neki od primera.
//    Primer poziva funkcija:
//    Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//    Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//    Primer izvrsenja main programa:
//    Unesite vrednost u eurima: 3
//    Unesite valutu za konverziju: RSD
//3 EUR je 351.6339 RSD
//    Konverzija eura u druge valute:
//            1 EUR = 117.2113 RSD
//1 EUR = 1.1821 USD
//1 EUR = 89.2323 RUB
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Unesite vrednost u evrima: ");
    double value = s.nextDouble();

    System.out.print("Unesite valutu za konverziju(RSD/USD/RUB): ");
    String currency = s.next();

    System.out.println(value + " EUR je " + convert(value,currency) + currency);
}

public static Double convert (double value, String currency) {
    if (currency.equals("RSD")){
        return value * 117.2113;
    } else if (currency.equals("USD")) {
        return value * 1.1821;
    } else if (currency.equals("RUB")) {
        return value * 89.2323;
    } else {
        return null;
    }
}
}
