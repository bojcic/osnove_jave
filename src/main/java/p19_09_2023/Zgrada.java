package p19_09_2023;

public class Zgrada extends Objekat {
//    Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//    broj stanova
//    konstuktore, gettere i setter
//    porez racuna po formuli koeficijent * povrsina * broj stanova
//    prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
    private int apartments;

    public Zgrada(String addres, double povrsina, int zone, int apartments) {
        super(addres, povrsina, zone);
        this.apartments = apartments;
    }
    @Override
    public double tax(){
        return this.coefficient()*this.getPovrsina()*this.getApartments();
    }
    @Override
    public void print(){
        System.out.println("Adresa: " + this.getAddres());
        System.out.println("Površina: " + this.getPovrsina() + " Zona: " + this.getZone() + " Broj stanova: " + this.getApartments());
    }

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }
}
