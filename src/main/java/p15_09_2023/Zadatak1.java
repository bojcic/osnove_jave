package p15_09_2023;

public class Zadatak1 {
//    Kreirati klasu Osoba koja od atributa ima:
//    ime i prezime
//            jmbg
//    konstuktor sa parametrima
//    metodu stampaj koja stampa podatke u formatu
//    ime prezime, jmbg
//
//
//    Kreirati klasu Student koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    broj indeksa
//    dug za skolarinu
//    konstuktor sa parametrima
//    metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//    Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//    Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    naziv predmeta koji predaje
//    iznos plate
//    konstuktor sa parametrima
//    metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//    Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//
//    U glavnom programu kreirati 2 studenta i 2 profesora.
        public static void main(String[] args) {
        Student vladimir = new Student("Vladimir","Bojčić","124453",12542.48);
        Student pera = new Student("Petar","Petrović","124453",122.48);
        Profesor mica = new Profesor("Mića Bradina", "2411555","Uvod u pečenje",180654.70);

            vladimir.print();

            pera.payTuition(120.00);
            pera.print();

            mica.salaryIncrease(10);
            mica.print();


    }
}
