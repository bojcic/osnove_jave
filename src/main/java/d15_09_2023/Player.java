package d15_09_2023;

import java.util.Scanner;

public class Player extends Person{
    //    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
    private int number;
    private String position;
    private boolean captain;

    public Player() {
    }

    public Player(String fullName, String jmbg, int birthYear, int number, String position, boolean captain) {
        super(fullName, jmbg, birthYear);

        this.number = number;
        this.position = position;
        this.captain = captain;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Broj: " + this.getNumber());
        if (this.isCaptain()){
            System.out.println("Pozicija: " + this.getPosition() + " - kapiten");
        } else {
            System.out.println("Pozicija: " + this.getPosition());
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isCaptain() {
        return captain;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }
}
