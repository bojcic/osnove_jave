package p08_09_2023;


public class Zadatak1{
//    Krairti klasu SlackMessage koja ima:
//    tekst poruke
//    ime i prezime osobe koja je stavila poruku
//    datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//(dopuna) kreirati metodu za stampu koja stampa podatke u formatu
//[ime i prezime osobe] - [kad je poslata]
//            [Tekst poruke]
//    U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke
//

    public static void main(String[] args) {
        SlackMessage prvi = new SlackMessage();
        prvi.nalog = "Pera Perić";
        prvi.tekst = "Desi brate kako si";
        prvi.datumIVreme = "26.08.2023 18:55";

       SlackMessage drugi = new SlackMessage();
        drugi.nalog = "Zvonko Bombonko";
        drugi.tekst = "Evo brate dobro je kako ti";
        drugi.datumIVreme = "28.08.2023. 19:36";

        prvi.print();
        drugi.print();

        prvi.azuriranje("sadsa", "saadsad");
        drugi.azuriranje("sfsdfsdf", "fsdfsdfsd");

        prvi.print();
        drugi.print();





    }

}
