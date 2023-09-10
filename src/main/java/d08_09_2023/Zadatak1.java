package d08_09_2023;

public class Zadatak1 {
//    1.	Napisati klasu Proizvod koja ima atribute
//    a.	naziv proizvoda (String)
//    b.	cenu proizvoda (double)
//    c.	težinu proizvoda u gramima. (double)
//    i metode:
//    d.	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//    e.	povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//            f.	vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//    g.	racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//            -	za tezinu do 100g, postarina iznosi 200din
//-	za tezinu od 101g do 500g, postarina iznosi 400din
//-	za tezinu preko 500g, postarina iznosi 1000din
//
//    U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

    public static void main(String[] args) {
        Proizvod_zadatak1 monitor = new Proizvod_zadatak1();
        monitor.naziv = "LG 28 28MQ780-B Dual monitor sa ergo postoljem";
        monitor.cena = 89999.99;
        monitor.gramaza = 4300;

        Proizvod_zadatak1 kutija = new Proizvod_zadatak1();
        kutija.naziv = "Kutija za pakovanje";
        kutija.cena = 149.99;
        kutija.gramaza = 100;

        monitor.stampaj();
        monitor.povecajCenu(0.01);
        System.out.println("Povećanje cene: " + monitor.cena );
        System.out.println("Cena sa popustom: " + monitor.vratiCenuSaPopustom(30));
        System.out.println("Poštarina: " + monitor.racunajPostarinu());

        kutija.stampaj();
        kutija.povecajCenu(20);
        System.out.println("Povećanje cene: " + kutija.cena );
        System.out.println("Cena sa popustom: " + kutija.vratiCenuSaPopustom(13));
        System.out.println("Poštarina: " + kutija.racunajPostarinu());
    }
}
