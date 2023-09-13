package d12_09_2023;

public class Ugovor {
    private int day;
    private int month;
    private int year;
    private FizickoLice seller;
    private FizickoLice buyer;
    private double sellingPrice;
    private String address;
    public Ugovor(int day, int month, int year, FizickoLice seller, FizickoLice buyer){
        this.day=day;
        this.month=month;
        this.year=year;
        this.seller=seller;
        this.buyer=buyer;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public FizickoLice getBuyer() {
        return buyer;
    }

    public FizickoLice getSeller() {
        return seller;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public double earningsPercent (){
        if (this.buyer.getLoyalty()){
            return 0.02;
        } else {
            return 0.03;
        }
    }
    public double income(){
        return 1000 + this.sellingPrice * this.earningsPercent();
    }
    public void printContract(){
        System.out.println("Dana " + this.day + "." + this.month + "." + this.year+ ". godine sklopljen je ugovor između " + this.seller.getFullName() + " i " + this.buyer.getFullName() + " o kupovini nekretnine na adresi " + this.address + " po ceni od " + this.sellingPrice + " €, pri čemu je kupac u obavezi da agenciji isplati novčanu vrednost u iznosu od " + this.income());
    }

}
