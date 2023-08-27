package d25_08_2023;

public class Zadatak1 {
//    Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje
//    metode za razlicite vrednosti.
public static void main(String[] args) {
    int a = 5;
    stampajVrednostZa10Vecu(a);
    a =10;
    stampajVrednostZa10Vecu(a);
    a=-10;
    stampajVrednostZa10Vecu(a);
    a=0;
    stampajVrednostZa10Vecu(a);

}
public static void stampajVrednostZa10Vecu(int a){
    a=a + 10;
    System.out.println(a);

}
}
