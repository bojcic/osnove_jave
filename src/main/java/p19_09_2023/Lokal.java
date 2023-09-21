package p19_09_2023;

public class Lokal extends Objekat{
//    Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//    konstuktore
//    porez racuna po formuli koeficijent * povrsina * 1.3
//    prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
    public Lokal(String addres, double povrsina, int zone) {
        super(addres, povrsina, zone);
    }
    @Override
    public double tax(){
        return this.coefficient()*this.getPovrsina()*1.3;
    }
    @Override
    public void print(){
        System.out.println("Adresa: " + this.getAddres());
        System.out.println("Površina: " + this.getPovrsina() + " Zona: " + this.getZone());
    }
}
