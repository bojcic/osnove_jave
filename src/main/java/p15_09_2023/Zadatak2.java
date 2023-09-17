package p15_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Visa card1 = new Visa(250,"4012-1239-1221-3381", 2025,10,"Vladimir Bojčić");
        MasterCard card2 = new MasterCard(300,"4012-1239-1221-3381", 2024,5);

        card1.transaction(25);
        card2.transaction(10);

        card1.print();
        card2.upkeep();
        card2.print();
    }
}
