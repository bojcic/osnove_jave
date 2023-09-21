package p19_09_2023;

import java.util.ArrayList;

public class PoreskaUprava{
//    Kreirati klasu PoreskaUprava koja za atribute ima:
//    ime grada u kom se nalazi
//    niz objekata
//    metodu dodaj objekat
//    metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//    metodu koja vraca objekat sa najmanjim porezom
//    metodu koja racuna ukupan porez za ceo grad
//    metodu koja stampa sve objekte
    private String objectName;
    private ArrayList<Objekat> objekti;

    public PoreskaUprava(String objectName) {
        objekti = new ArrayList<Objekat>();
        this.objectName = objectName;

    }
    public void addObjekat(Objekat objekat){
        this.objekti.add(objekat);
    }
    public Objekat highTax(){
        Objekat check=this.objekti.get(0);
        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).tax()>check.tax()){
                check=this.objekti.get(i);
            }
        }
        return check;
    }

    public Objekat lowTax(){
        Objekat check=this.objekti.get(0);
        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).tax()<check.tax()){
                check=this.objekti.get(i);
            }
        }
        return check;
    }
    public double totalTax(){
        double totalTax=0;
        for (int i = 0; i < this.objekti.size(); i++) {
            totalTax+=this.objekti.get(i).tax();
        }
        return totalTax;
    }
    public void print(){
        for (int i = 0; i < this.objekti.size(); i++) {
            this.objekti.get(i).print();
        }
    }

}
