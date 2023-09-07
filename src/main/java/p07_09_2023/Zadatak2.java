package p07_09_2023;

public class Zadatak2 {
//    Krairti klasu SlackMessage koja ima:
//    tekst poruke
//    ime i prezime osobe koja je stavila poruku
//    datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//    U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//            [ime i prezime osobe] - [kad je poslata]
//            [Tekst poruke]
public static void main(String[] args) {
    SlackMessage prvi = new SlackMessage();
    prvi.nalog = "Pera Perić";
    prvi.tekst = "Desi brate kako si";
    prvi.datumIVreme = "26.08.2023 18:55";

    SlackMessage drugi = new SlackMessage();
    drugi.nalog = "Zvonko Bombonko";
    drugi.tekst = "Evo brate dobro je kako ti";
    drugi.datumIVreme = "28.08.2023. 19:36";

    System.out.println(prvi.nalog + " - " + prvi.datumIVreme);
    System.out.println(prvi.tekst);

    System.out.println(drugi.nalog + " - " + drugi.datumIVreme);
    System.out.println(drugi.tekst);
}

}
