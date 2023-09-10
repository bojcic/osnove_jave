package d08_09_2023;

public class Proizvod_zadatak1 {
    public String naziv;
    public double cena;
    public double gramaza;

    public void stampaj (){
        System.out.println(this.naziv + " - " + this.cena + " - " + this.gramaza);
    }
    public void povecajCenu (double povecanje){
        this.cena += povecanje;
    }
    public double vratiCenuSaPopustom (double popust){
        double cenaSaPopustom = this.cena - (this.cena * popust/100);
        return cenaSaPopustom;

    }
    public int racunajPostarinu (){
        if (this.gramaza <= 100){
            return 200;
        } else if (this.gramaza <= 500) {
            return 400;
        } else {
            return 1000;
        }


    }


}
