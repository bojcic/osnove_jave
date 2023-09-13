package p11_09_2023;

public class Student {
    private String ime;
    private String prezime;
    private boolean budzet;
    private int indeks;
    public void setIme(String ime){
        this.ime=ime;
    }
    public String getIme(){
        return this.ime;
    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }
    public String getPrezime(){
        return this.prezime;
    }
    public void setIndeks(int indeks){
        this.indeks=indeks;
    }
    public int getIndeks(){
        return this.indeks;
    }
    public void setBudzet(boolean budzet){
        this.budzet=budzet;
    }
    public boolean getBudzet(){
        return this.budzet;
    }
    public void printStudent(){
        System.out.println(this.ime + " " + this.prezime + " | Broj indeksa: " + this.indeks);
        if (getBudzet()){
            System.out.println("Student je na budžetu!");
        }else {
            System.out.println("Student nije na budžetu!");
        }

    }
}
