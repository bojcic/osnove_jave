package d08_09_2023;

public class Zadatak2 {
//    Kreirati klasu FacebookPost koja ima:
//    Od atributa:
//            -	ime i prezime korisnika koji je objavio post
//-	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//-	tekst objave
//-	broj lajkova
//-	broj deljenja
//    Od metoda:
//            -	like(), koja povecava broj lajkova za 1.
//            -	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//            -	share(), koja povecava broj deljenja za 1
//            -	print(), koja stampa objavu u formatu:
//            (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//            (tekst objave)
//    Likes (broj lajkova) | Shares (broj deljenja)
//
//    U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//    Primer stampanja:
//    Milan Jovanovic >>> Pera Peric
//    Ovo je tekst objave
//    Likes 3 | Shares 1
public static void main(String[] args) {
    FacebookPost_zadatak2 igrica = new FacebookPost_zadatak2();
    igrica.korisnikObjava = "Candy Crush";
    igrica.korisnikProfil = "Mira Nokti";
    igrica.tekstPoruke = "Congratulations! You have reached level 854!";
    igrica.like();  igrica.like();  igrica.like();  igrica.like();  igrica.like();
    igrica.dislike(); igrica.dislike(); igrica.dislike(); igrica.dislike(); igrica.dislike(); igrica.dislike();
    igrica.share(); igrica.share(); igrica.share(); igrica.share();
    igrica.print();

    FacebookPost_zadatak2 poziv = new FacebookPost_zadatak2();
    poziv.korisnikObjava = "Svetlana Petrović";
    poziv.korisnikProfil = "Aerodrom Nikola Tesla";
    poziv.tekstPoruke = "Kad stižeš, Boso?";
    poziv.like();  poziv.like();  poziv.like();  poziv.like();  poziv.like();
    poziv.dislike();
    poziv.share(); poziv.share(); poziv.share(); poziv.share();
    poziv.print();
}

}
