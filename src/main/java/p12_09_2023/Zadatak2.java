package p12_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Korisnik anonimous = new Korisnik();
        anonimous.setUsername("Vladimir");
        Korisnik goldUser = new Korisnik();
        goldUser.setUsername("Neko Jači");
        goldUser.subscribe(150);

        ZoomCall firstCall = new ZoomCall("nekaadresa","xxxxxxxxx",anonimous);
        firstCall.setGuest(goldUser);
        firstCall.print();

        System.out.println();

        ZoomCall secondCall = new ZoomCall("drugaadresa", "xxxxxx", goldUser);
        secondCall.setGuest(anonimous);
        secondCall.print();


    }
}
