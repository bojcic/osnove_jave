package p11_09_2023;

public class Reziser {
    private String punoIme;
    private int starost;
    private Film reziraoFilm;

    public Reziser(String punoIme, int starost) {
        this.punoIme = punoIme;
        this.starost = starost;
    }

    public Reziser(String punoIme, int starost, Film reziraoFilm) {
        this.punoIme = punoIme;
        this.starost = starost;
        this.reziraoFilm = reziraoFilm;
    }

    public Reziser() {
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void setReziraoFilm(Film reziraoFilm) {
        this.reziraoFilm = reziraoFilm;
    }

    public Film getReziraoFilm() {
        return this.reziraoFilm;
    }

    public void stampaj() {
        System.out.println("Reziser: " + this.punoIme);
        System.out.println("Starost: " + this.starost);
        if (this.reziraoFilm != null) {
//            System.out.println("Rezirao je film: " + this.reziraoFilm.getNaziv());
//            System.out.println("Film je izaso " + this.reziraoFilm.getGodina());
            this.reziraoFilm.stampaj();
        }

    }
}
