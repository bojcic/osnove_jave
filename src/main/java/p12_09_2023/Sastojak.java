package p12_09_2023;

public class Sastojak {
    private String spiceName;
    private double spicePrice;
    public Sastojak (String spiceName, double spicePrice){
        this.spiceName = spiceName;
        this.spicePrice = spicePrice;
    }
    public String getSpiceName(){
        return this.spiceName;
    }
    public double getSpicePrice(){
        return this.spicePrice;
    }
}
