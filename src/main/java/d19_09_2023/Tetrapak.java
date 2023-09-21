package d19_09_2023;

public class Tetrapak extends Ambalaza{
    private boolean recyclable;
    private double startingPrice;

    public Tetrapak(String barCode, String itemName, double netoWeight, double brutoWeight, boolean recyclable, double startingPrice) {
        super(barCode, itemName, netoWeight, brutoWeight);
        this.recyclable = recyclable;
        this.startingPrice = startingPrice;
    }
    @Override
    public double price(){
        if (this.recyclable){
            return this.finalWeight() * 1.5 + this.startingPrice;
        } else {
            return this.startingPrice;
        }
    }
    @Override
    public void print(){
        System.out.println("Artikal: " + this.getItemName() + " barcode: " + this.getBarCode());
        if (this.recyclable){
            System.out.println("Pakovanje ima " + this.finalWeight() + "grama i ambalaža se može reciklirati.");
        } else {
            System.out.println("Pakovanje ima " + this.finalWeight() + "grama i ambalaža se ne može reciklirati.");
        }
        System.out.println("Cena je " + this.price() + " RSD");

    }

    public boolean isRecyclable() {
        return recyclable;
    }

    public void setRecyclable(boolean recyclable) {
        this.recyclable = recyclable;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(double startingPrice) {
        this.startingPrice = startingPrice;
    }
}
