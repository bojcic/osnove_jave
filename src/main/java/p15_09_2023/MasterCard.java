package p15_09_2023;

public class MasterCard extends CreditCard{
    public MasterCard(double balance, String cardNumber, int validYear, int validMonth) {
        super(balance, cardNumber, validYear, validMonth);
    }
    @Override
    public void transaction(double amount){
        amount = amount + amount * (1.8/100);
        super.transaction(amount);
    }
    public void upkeep(){
        this.balance -= 2;
    }
    @Override
    public void print(){
        System.out.println("MasterCard: ");
        super.print();
    }
}
