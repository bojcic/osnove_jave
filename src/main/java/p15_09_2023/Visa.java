package p15_09_2023;

public class Visa extends CreditCard {
    private String fullName;

    public Visa(double balance, String cardNumber, int validYear, int validMonth, String fullName) {
        super(balance, cardNumber, validYear, validMonth);
        this.fullName = fullName;
    }
    @Override
    public void transaction(double amount){
        if (amount * (1.8/100) < 4.0){
            amount = amount + 4;
        } else {
            amount = amount + amount * (1.8/100);
        }
        super.transaction(amount);

    }
    @Override
    public void print(){
        System.out.println("Visa: ");
        super.print();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
