package d25_08_2023;

public class Zadatak3 {
//    Napisati metodu koja stampa podatke o korisniku u formatu:
//    JMBG: [jmbg]
//    Ime: [ime]
//    Prezime: [prezime]
//    God. rodjenja: [god]
//    Aktivan: [true/false]
//    Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
public static void main(String[] args) {
stampaForme("1605997333333","Vladimir", "Bojčić", 1997,true);

String jmbg = "13121312";
String ime = "Vladimir";
String prezime = "Bojčić";
int godinaRođenja = 1900;
boolean aktivan = false;
stampaForme(jmbg,ime,prezime,godinaRođenja,aktivan);
}
public static void stampaForme (String jmbg, String ime, String prezime, int godinaRođenja, boolean aktivan) {
    System.out.println("JMBG: " + jmbg);
    System.out.println("Ime: " + ime);
    System.out.println("Prezime: " + prezime);
    System.out.println("Godina rođenja: " + godinaRođenja);
    System.out.println("Aktivan: " + aktivan);
}
}
