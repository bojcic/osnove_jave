package d19_09_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> packages;

    public Korpa() {
        this.packages = new ArrayList<>();
    }
    public void addPackage(Ambalaza newPackage){
        this.packages.add(newPackage);
    }
    public void removePackage(String barCode){
        for (int i = 0; i < this.packages.size(); i++) {
            if (this.packages.get(i).getBarCode().equals(barCode)){
                this.packages.remove(i);
            }
        }
    }
    private double totalDiscount(double discount){
        double sum=0;
        for (int i = 0; i < this.packages.size(); i++) {
            sum += this.packages.get(i).price();
        }
        return sum - (sum*(discount/100));
    }
    public void totalCartDiscount(SuperKartica card){
        this.totalDiscount(card.getDiscount());
    }
    public ArrayList<Ambalaza> getPackages() {
        return packages;
    }
}
