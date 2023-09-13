package d12_09_2023;

public class Racun {
    private String accountNumber;
    private String fullName;
    private double balance;
    public Racun(String accountNumber, String fullName){
        this.accountNumber=accountNumber;
        this.fullName=fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance=balance+amount;
    }
    public void withdrawal(double amount){
        this.balance=balance-amount;
    }
    public void printAccount(){
        System.out.println(this.fullName + " - " + this.accountNumber);
        System.out.println("Stanje na računu je " + this.getBalance() + " RSD.");
    }

}
