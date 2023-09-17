package d15_09_2023;

public class Zadatak2 {
//    Kreirati klasu Karton koja ima:
//    tip kartona (crveni, zuti)
//    konstuktore za koje mislite da ce vam trebati
//    gettere i settere za karton
//
//    Kreirati klasu Osoba koja ima:
//    ime i prezime
//            jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//            (ime i prezime), (jmbg), (godina rodjenja)
//
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    niz kartona
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu dodaj karton, gde se dodaje karton u niz
//    metodu koja vraca broj zutih kartona
//    metodu koja vraca broj crvenih kartona
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//
//    U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
    public static void main(String[] args) {
        Player2 captain = new Player2("Vladimir Bojčić", "1352153135", 1997, 12, "Desni bek", true);
        Card yellow = new Card("zuti");
        Card red = new Card("crveni");
        captain.addCard(yellow);
        captain.addCard(yellow);
        captain.addCard(red);
        captain.addCard(yellow);
        captain.addCard(red);
        captain.addCard(red);

        captain.print();

    }

}
