package p11_09_2023;

public class Zadatak2 {
//    Za klasu Tacka, koja ima privatne atribute:
//    x - x koordinata
//    y - y koordinata
//    Javne metode:
//    metodu stampaj
//    imamo difoltni konstruktor
//    imamo konstuktor koji prima obe koordinate za kreiranje objekta
//    geter za x
//    geter za y
//    seter za x
//    seter za y
//
//    U glavnom programu kreirati dva objekta:
//    Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//    Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40
public static void main(String[] args) {
    Tacka prvi = new Tacka();
    prvi.setX(10);
    prvi.setY(20);
    prvi.stampaj();

    Tacka drugi = new Tacka(30,40);
    drugi.stampaj();
}
}
