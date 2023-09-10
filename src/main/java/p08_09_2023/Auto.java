package p08_09_2023;

public class Auto {
    public String vozac;
    public String markaAutomobila;
    public int brojVrata;
    public double potrosnjaNa100Km;
    public double trenutnaBrzina;
    public int godinaProizvodnje;
    public int mesecRegistracija;
    public int kubikaza;
    public String brojRegistracije;
    public boolean klima;
    public int maxBrzina;





    public void stampa() {
        System.out.println(this.vozac);
        System.out.println(this.markaAutomobila + " - " + this.brojVrata + "-oro vrata");
        System.out.println("Potrošnja je " + this.potrosnjaNa100Km);
        System.out.println("Trenutna brzina automobila je " + this.trenutnaBrzina);
    }

    public boolean prekoracenje(int ogranicenje) {
        if (this.trenutnaBrzina > ogranicenje) {
            return true;
        }else {
            return  false;
        }
    }

    public double kazna (double ogranicenje){
        if (this.trenutnaBrzina > ogranicenje){
            double kazneniPoeni = this.trenutnaBrzina - ogranicenje;
            double novacKazna = kazneniPoeni * 1000;
            return novacKazna;
        }  else {
            return 0.0;
        }
    }

    public boolean oldtimer (int godinaProizvodnje){
        if (this.godinaProizvodnje < 1950){
            return  true;
        } else {
            return false;
        }
    }
    public boolean registracija (int trenutniMesec){
        if (trenutniMesec >= mesecRegistracija){
            return false;
        } else {
            return true;
        }
    }

    public double cenaRegistracije(){
        if (kubikaza < 2000){
            double cena = kubikaza * 100;
            return cena;
        } else {
            double cena = (kubikaza * 100) * 1.3;
            return cena;
        }
    }

    public void dodajGas(){
        if (trenutnaBrzina + 10.0 <= 100) {
            trenutnaBrzina = trenutnaBrzina + 10.0;

        }
    }

    public void koci (){
        if ((trenutnaBrzina-10) >= 0 ) {
            trenutnaBrzina = trenutnaBrzina - 10;
      }
    }

    public double potrosnjaAuta (){
        double faktorKlime;
        if (klima){
            faktorKlime = 1.2;
        } else {
            faktorKlime = 1.0;
        }

        double potrosnja = (trenutnaBrzina/100 * potrosnjaNa100Km) * faktorKlime;
        return potrosnja;
    }
    public void tebela (){
        String tabela = "";
        for (int i = 0; i < maxBrzina; i++) {
            if (i+1 <= trenutnaBrzina){
                tabela += "|";
            } else {
                tabela += ".";
            }
        }
        System.out.println(trenutnaBrzina + "/" + maxBrzina);
    }
}
