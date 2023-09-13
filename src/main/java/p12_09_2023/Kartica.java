package p12_09_2023;

public class Kartica {
    private String cardNumber;
    private int discount;
    public Kartica (String cardNumber, int discount){
        this.cardNumber=cardNumber;
        this.discount=discount;
    }
    public String getCardNumber(){
        return this.cardNumber;
    }
    public int getDiscount(){
        return this.discount;
    }
}
