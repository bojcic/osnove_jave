package d11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Autor mica = new Autor("Miodrag","Majić");
        Autor vlada = new Autor("Vladimir", "Nabokov");
        Autor djole = new Autor("Džordž","Orvel");

        Knjiga lolita = new Knjiga("Lolita",vlada);
        lolita.setIsbn(12131312);
        lolita.setReleaseYear(1955);
        Knjiga bledaVatra = new Knjiga("Bleda vatra", vlada);
        bledaVatra.setIsbn(9863125);
        bledaVatra.setReleaseYear(1962);
        Knjiga farma = new Knjiga("Životinjska farma", djole);
        farma.setIsbn(45631984);
        farma.setReleaseYear(1945);
        Knjiga srbija = new Knjiga("1984", djole);
        srbija.setIsbn(13121389);
        srbija.setReleaseYear(1949);
        Knjiga pelikan = new Knjiga("Ostrvo pelikana",mica);
        pelikan.setIsbn(36524);
        pelikan.setReleaseYear(2021);
        Knjiga deca = new Knjiga("Deca zla", mica);
        deca.setIsbn(7532159);
        deca.setReleaseYear(2019);

        lolita.printBook();
        bledaVatra.printBook();
        farma.printBook();
        srbija.printBook();
        pelikan.printBook();
        deca.printBook();
    }
}
