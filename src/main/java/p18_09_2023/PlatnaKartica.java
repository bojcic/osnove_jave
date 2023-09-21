package p18_09_2023;

public abstract class PlatnaKartica {
    protected double balance;
    protected String cardNumber;
    protected int validYear;
    protected int validMonth;

    public PlatnaKartica(double balance, String cardNumber, int validYear, int validMonth) {
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.validYear = validYear;
        this.validMonth = validMonth;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public abstract void transaction(double amount);
    public abstract void print();
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
