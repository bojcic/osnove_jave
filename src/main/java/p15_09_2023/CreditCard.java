package p15_09_2023;

public class CreditCard {
    protected double balance;
    protected String cardNumber;
    protected int validYear;
    protected int validMonth;


    public CreditCard(double balance, String cardNumber, int validYear, int validMonth) {
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.validYear = validYear;
        this.validMonth = validMonth;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void transaction (double amount){
        this.balance-=amount;
    }
    public void print(){
        System.out.println(this.getCardNumber() + ", " + this.getValidMonth() + "/" + this.getValidYear() + ", $" + this.getBalance());
    }

    public double getBalance() {
        return balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getValidYear() {
        return validYear;
    }

    public int getValidMonth() {
        return validMonth;
    }
}
