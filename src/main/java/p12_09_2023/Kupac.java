package p12_09_2023;

public class Kupac {
    private String fullName;
    private Kartica card;
    public Kupac (String fullName, Kartica card){
        this.fullName=fullName;
        this.card=card;
    }
    public String getFullName(){
        return this.fullName;
    }
    public Kartica getCard(){
        return this.card;
    }
    public void printKupac(){
        System.out.println(this.fullName + " - " + this.card.getCardNumber());
    }


}
