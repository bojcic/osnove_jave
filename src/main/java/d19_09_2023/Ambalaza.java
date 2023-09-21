package d19_09_2023;

public abstract class Ambalaza {
    private String barCode;
    private String itemName;
    private double netoWeight;
    private double brutoWeight;

    public Ambalaza() {
    }

    public Ambalaza(String barCode, String itemName, double netoWeight, double brutoWeight) {
        this.barCode = barCode;
        this.itemName = itemName;
        this.netoWeight = netoWeight;
        this.brutoWeight = brutoWeight;
    }
    public double finalWeight(){
        return this.brutoWeight-this.netoWeight;
    }
    public abstract double price();
    public abstract void print();

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getNetoWeight() {
        return netoWeight;
    }

    public void setNetoWeight(double netoWeight) {
        this.netoWeight = netoWeight;
    }

    public double getBrutoWeight() {
        return brutoWeight;
    }

    public void setBrutoWeight(double brutoWeight) {
        this.brutoWeight = brutoWeight;
    }
}
