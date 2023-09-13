package d12_09_2023;

public class Transakcija {
    private int transactionId;
    private Racun sender;
    private Racun receiver;
    public Transakcija(int transactionId, Racun sender, Racun receiver, double amount){
        this.transactionId=transactionId;
        this.sender=sender;
        this.receiver=receiver;
        this.transaction(amount);
    }
    public double provision(double amount){
        if (amount<4500.0){
            return 45.0;
        } else {
            return amount/100;
        }
    }
    public void transaction(double amount){
        this.sender.withdrawal(amount);
        this.sender.withdrawal(provision(amount));
        this.receiver.deposit(amount);
    }
    public void printTransaction(){
        System.out.println(this.transactionId);
        System.out.println("Pošaljilac: " + this.sender.getFullName() + " - " + this.sender.getAccountNumber());
        System.out.println("Primalac: " + this.receiver.getFullName() + " - " + this.receiver.getAccountNumber());
    }

    public void setSender(Racun sender) {
        this.sender = sender;
    }

    public Racun getSender() {
        return sender;
    }

    public void setReceiver(Racun receiver) {
        this.receiver = receiver;
    }

    public Racun getReceiver() {
        return receiver;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getTransactionId() {
        return transactionId;
    }
}
