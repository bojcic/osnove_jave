package d19_09_2023;

public class SuperKartica {
    private String cardNumber;
    private String cardFullName;
    private double discount;

    public SuperKartica(String cardNumber, String cardFullName, double discount) {
        this.cardNumber = cardNumber;
        this.cardFullName = cardFullName;
        this.discount = discount;
    }
    public void print(){
        System.out.println(this.cardNumber + " - " + this.cardFullName);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardFullName() {
        return cardFullName;
    }

    public void setCardFullName(String cardFullName) {
        this.cardFullName = cardFullName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
