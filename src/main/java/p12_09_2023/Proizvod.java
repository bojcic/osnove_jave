package p12_09_2023;

public class Proizvod {
    private String productName;
    private Kupac customer;
    private double producePrice;
    public Proizvod(String productName, double producePrice, Kupac customer){
        this.customer=customer;
        this.producePrice=producePrice;
        this.productName=productName;
    }
    public String getProductName(){
        return this.productName;
    }

    public double getProducePrice() {
        return producePrice;
    }

    public Kupac getCustomer() {
        return customer;
    }
    public double price(){
        return this.producePrice * 1.9 * (100.0-this.customer.getCard().getDiscount());
    }
    public void printProduct(){
        System.out.println(this.productName + " - " + this.price());
        System.out.println(this.customer.getFullName() + " - " + this.customer.getCard().getCardNumber());
    }
}
