package d15_09_2023;

import java.util.Scanner;

public class Person {
    //    Kreirati klasu Osoba koja ima:
//    ime i prezime
//            jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//            (ime i prezime), (jmbg), (godina rodjenja)
    protected String fullName;
    protected String jmbg;
    protected int birthYear;

    public Person() {
    }

    public Person(String fullName, String jmbg, int birthYear) {
        this.fullName = fullName;
        this.jmbg = jmbg;
        this.birthYear = birthYear;
    }
    public void print(){
        System.out.println(this.getFullName() + ", " + this.getJmbg() + ", " + this.getBirthYear());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
