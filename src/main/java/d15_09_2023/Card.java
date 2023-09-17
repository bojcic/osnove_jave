package d15_09_2023;

public class Card {
    //    Kreirati klasu Karton koja ima:
//    tip kartona (crveni, zuti)
//    konstuktore za koje mislite da ce vam trebati
//    gettere i settere za karton
    protected String cardType;

    public Card(String cardType) {
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
