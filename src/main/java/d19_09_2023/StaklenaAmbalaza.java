package d19_09_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private double fee;
    private boolean hasFee;
    private double startPrice;

    public StaklenaAmbalaza(String barCode, String itemName, double netoWeight, double brutoWeight, double fee, boolean hasFee, double startPrice) {
        super(barCode, itemName, netoWeight, brutoWeight);
        this.fee = fee;
        this.hasFee = hasFee;
        this.startPrice = startPrice;
    }
    @Override
    public double price(){
        if (this.hasFee){
            return this.startPrice * 1.2 + this.fee;
        } else {
            return this.startPrice * 1.2;
        }
    }
    @Override
    public void print(){
        System.out.println("Artikal: " + this.getItemName() + " barcode: " + this.getBarCode());
        if (this.hasFee){
            System.out.println("Kaucija se plaća i cena je " + this.price() + " RSD");
        } else {
            System.out.println("Kaucija se ne plaća i cena je " + this.price() + " RSD");
        }

    }
    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public boolean isHasFee() {
        return hasFee;
    }

    public void setHasFee(boolean hasFee) {
        this.hasFee = hasFee;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }
}
