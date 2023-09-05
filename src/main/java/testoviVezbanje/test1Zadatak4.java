package testoviVezbanje;

public class test1Zadatak4 {
    //    Napisati metodu koja vrsi konverziju metara u cm, dm, km. Metoda kao parametre
//    prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju i vraca
//    konvertovanu vrednost.
//    Podsetnik za konverziju jedinica:
//            1m = 100 cm
//1m = 10 dm
//1m = 0.001 km
//    Primer poziva metode
//    Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//    Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//    U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati
//    odgovarajuce poruke na ekranu.
//    Primer izvrsenja programa:
//            3.5m je 350cm
//3.5m je 35dm
//3.5m je 0.0035km

    public static void main(String[] args) {

        double value = 3.5; String unit = "cm";
        System.out.println(value + "m je " + convert(value,unit) + unit);

        value = 7; unit = "dm";
        System.out.println(value + "m je " + convert(value,unit) + unit);

        value = 100; unit = "km";
        System.out.println(value + "m je " + convert(value,unit) + unit);

    }

    public static Double convert (double value, String unit){
        double newValue = 0;
        if (unit.equals("cm")){
            newValue = value * 100;
        } else if (unit.equals("dm")) {
            newValue = value * 10;
        } else if (unit.equals("km")) {
            newValue = value * 0.0001;
        }
        return newValue;

    }
}
