package d07_09_2023;

public class Zadatak2 {
//    Kreiranje klase "Automobil"
//    Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.
public static void main(String[] args) {
    Automobil_zadatak2 audi = new Automobil_zadatak2();
    audi.marka = "Audi";
    audi.model = "RS Q8";
    audi.godinaProizvodnje = 2023;

    Automobil_zadatak2 bmw = new Automobil_zadatak2();
    bmw.marka = "BMW";
    bmw.model = "8 Series Gran Coupe";
    bmw.godinaProizvodnje = 2023;

    Automobil_zadatak2 mercedes = new Automobil_zadatak2();
    mercedes.marka = "Mercedes-Benz";
    mercedes.model = "C-class AMG C 63 S Coupe";
    mercedes.godinaProizvodnje = 2023;

    System.out.println(audi.marka + " - " + audi.model + " - " + audi.godinaProizvodnje);
    System.out.println(mercedes.marka + " - " + mercedes.model + " - " + mercedes.godinaProizvodnje);
    System.out.println(bmw.marka + " - " + bmw.model + " - " + bmw.godinaProizvodnje);


}
}
