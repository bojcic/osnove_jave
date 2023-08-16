package d15_08_2023;

public class Zadatak9v_slack {
    public static void main(String[] args) {

// Napisati program koji vrsi procentualnu procenu u fazi skidanja fajla.
// Program od informacija cuva naziv originalnog fajla, velicinu originalnog fajla u Mb (megabajtima)
// i velicinu skunutog dela fajla takodje u Mb. Na kraju programa racuna i ispisuje koji je deo fajla skinut.
// Stampanje se vrsi u formatu
// naziv fajla velicina originalnog fajla Mb/velicina skinutog dela fajla Mb
// *****************************
// ***********procenat %
// *****************************

        String fileName = "Rođa Raičević - A ja imam tebe";
        double fileSize = 500;
        double downSize = 2;
        double percent = (downSize * 100) / fileSize;

        System.out.println( fileName + " " + fileSize + "Mb/" + downSize + "Mb" );
        System.out.println("********************************************");
        System.out.println("*********** procenat skinutog " + percent + "%");
        System.out.print("********************************************");


    }
}
