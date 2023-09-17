package d15_09_2023;

import java.util.Scanner;

public class Coach extends Person{
    //    Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//    godine iskustva
//    tip trenera (kondicioni, za igru, pomocni, personalni)
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
    private int experience;
    private String type;

    public Coach(int experience, String type) {
        this.experience = experience;
        this.type = type;
    }

    public Coach(String fullName, String jmbg, int birthYear, int experience, String type) {
        super(fullName, jmbg, birthYear);
        this.experience = experience;
        this.type = type;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Tip: " + this.getType() + " - " + this.getExperience() + " godina iskustva");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
