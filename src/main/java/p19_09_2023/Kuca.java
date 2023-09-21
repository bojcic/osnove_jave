package p19_09_2023;

public class Kuca extends Objekat {

//    Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
//    konstuktore, gettere i setter
//    porez racuna po formuli: koeficijent * povrsina.
//    prepisati metodu stampaj tako da stampa sve podatke vezane za kucu

    private int residents;

    public Kuca(String addres, double povrsina, int zone, int residents) {
        super(addres, povrsina, zone);
        this.residents = residents;
    }
    @Override
    public double tax(){
        return this.coefficient()*this.getPovrsina();
    }
    @Override
    public void print(){
        System.out.println("Adresa: " + this.getAddres());
        System.out.println("Površina: " + this.getPovrsina() + " Zona: " + this.getZone() + " Broj članova domaćinstva: " + this.getResidents());
    }

    public int getResidents() {
        return residents;
    }

    public void setResidents(int residents) {
        this.residents = residents;
    }
}
