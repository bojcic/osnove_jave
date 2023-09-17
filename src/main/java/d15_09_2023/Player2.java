package d15_09_2023;

import java.util.ArrayList;

public class Player2 extends Person{
    //    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    niz kartona
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu dodaj karton, gde se dodaje karton u niz
//    metodu koja vraca broj zutih kartona
//    metodu koja vraca broj crvenih kartona
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
    private int number;
    private String position;
    private boolean captain;
    private ArrayList <Card> cards;

    public Player2() {
        this.cards = new ArrayList<Card>();
    }

    public Player2(String fullName, String jmbg, int birthYear, int number, String position, boolean captain) {
        super(fullName, jmbg, birthYear);
        this.cards = new ArrayList<>();
        this.number = number;
        this.position = position;
        this.captain = captain;
    }
    public void addCard(Card card){
        this.cards.add(card);
    }
    public int countYellow(){
        int counter=0;
        for (int i = 0; i < this.cards.size(); i++) {
            if (this.cards.get(i).getCardType().equals("zuti")){
                counter+=1;
            }
        }
        return counter;
    }
    public int countRed(){
        int counter=0;
        for (int i = 0; i < this.cards.size(); i++) {
            if (this.cards.get(i).getCardType().equals("crveni")){
                counter+=1;
            }
        }
        return counter;
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
        System.out.println("Žuti kartoni: " + this.countYellow() + " | Crveni kartoni: " + this.countRed());
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
