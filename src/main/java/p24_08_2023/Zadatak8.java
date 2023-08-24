package p24_08_2023;

import java.util.ArrayList;

public class Zadatak8 {
    public static void main(String[] args) {


//    Napisati program koji validira registracionu formu. Program treba da održava tri niza informacija:
//            **Niz polja za registraciju**: Ovaj niz treba da sadrži nazive polja koja se pojavljuju u registracionoj formi.
//
//**Niz očekivanih obaveznih polja**: Ovaj niz treba da sadrži za svako polje informaciju da li je polje obavezno za popunjavanje ili ne. Ako je odgovarajuća vrednost `true`, to znači da je polje obavezno. Ako je vrednost `false`, polje nije obavezno.
//
// **Niz trenutnih stanja polja**: Ovaj niz treba da za svako polje sadrži informaciju da li pored naziva polja treba ispisati zvezdicu (*) ili ne. Ako je odgovarajuća vrednost `true`, to znači da treba ispisati zvezdicu. Ako je vrednost `false`, zvezdica se ne ispisuje.
//
//    Program treba da radi na sledeći način:
//
//    Ispisuje registracionu formu sa nazivima polja iz prvog niza. Pored svakog naziva polja se ispisuje zvezdica (*) ako je odgovarajuća vrednost u trećem nizu `true`.
//
//    Validira formu na sledeći način:
//    Proverava da li su sva obavezna polja označena kao obavezna (ako je vrednost u drugom nizu `true`) i ispisuje grešku ako nisu.
//            -     Proverava da li neobavezna polja imaju označenu zvezdicu (ako je vrednost u trećem nizu `true`) i ispisuje grešku ako imaju.
//
//    Napomena: Pretpostavljamo da su sva tri niza iste dužine i da se podaci o istom polju nalaze na istom indeksu u sva tri niza.

        ArrayList<String> registrationFields = new ArrayList<String>();
        ArrayList<Boolean> required = new ArrayList<Boolean>();
        ArrayList<String> star = new ArrayList<String>();

        registrationFields.add("First name");
        registrationFields.add("Last name");
        registrationFields.add("E-mail");
        registrationFields.add("Password");
        registrationFields.add("Phone");
        registrationFields.add("Address");

        required.add(true);
        required.add(true);
        required.add(true);
        required.add(true);
        required.add(false);
        required.add(false);

        for (int i = 0; i < registrationFields.size(); i++) {
            boolean x = required.get(i);
            if (x == true) {
                star.add("*");
            } else {
                star.add("");
            }
        }
        for (int i = 0; i < registrationFields.size(); i++) {
            System.out.println(registrationFields.get(i) + star.get(i) + "____________");
        }


    }


}
