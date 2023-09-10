package p08_09_2023;

import java.util.Scanner;

public class SlackMessage {
    public String nalog;
    public String tekst;
    public String datumIVreme;

    public void azuriranje(String datumIVreme, String tekst){
        this.datumIVreme = datumIVreme;

        this.tekst = tekst;
    }


    public void print(){
        System.out.println(this.nalog + " - " + this.datumIVreme);
        System.out.println(this.tekst);
    }
}
