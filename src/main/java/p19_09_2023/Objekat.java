package p19_09_2023;

public abstract  class Objekat {
    //    Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi. NE NAZIVAJTE KLASU OBJECT !!
//    adresa (ulica i broj)
//    povrsina objekta
//    zona (1, 2 ili 3)
//    konstuktore, gettere i settere
//    metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//    zona 1, koeficijent je 1.4
//    zona 2, koeficijent je 1.1
//    zona 3, koeficijent je 1.05
//    abstraktnu metodu koja racuna i vraca porez objekta
//    abstraktnu metodu stampaj
    private String addres;
    private double povrsina;
    private int zone;

    public Objekat(String addres, double povrsina, int zone) {
        this.addres = addres;
        this.povrsina = povrsina;
        this.zone = zone;
    }
    public double coefficient(){
        if (this.getZone()==1){
            return 1.4;
        } else if (this.getZone()==2) {
            return 1.1;
        } else if (this.getZone()==3) {
            return 1.05;
        } else {
            return 0;
        }
    }
    public abstract double tax();
    public abstract void print();

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }
}
