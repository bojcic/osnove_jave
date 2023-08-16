package d15_08_2023;

public class Zadatak11v_slack {
    public static void main(String[] args) {
//        Napisati program koji izracunava velicinu slike na temelju dostupnih podataka.
//        Program cuva sledece informacije o slici:
//        Naziv slike
//        Rezoluciju (duzina i visina)
//        Na osnovu rezolucije, program racuna ukupan broj piksela u slici. Svaki piksel zauzima 1b (bajt).
//        Teorijski primer: ako je rezolucija slike 20x10, tada slika sadrzi ukupno 200 piksela, čime je njena velicina 200b.
//        Nakon toga, program treba da prikaze velicinu slike izrazenu u kilobajtima (kb) i megabajtima (mb),
//        uzimajuci u obzir sledece konverzije:
//        1 kb = 1024b
//        1 Mb= 1024 kb
//        Primer izvrsenja
//        File: profile-image.log
//        Resolution: 1920 x 1080
//        Size (kb): 2025
//        Size (Mb):  1.977

        String fileName = "Portret Tee Tairović";
        int resolutionHeight = 1920;
        int resolutionWidth = 1080;
        int sizeB = resolutionWidth * resolutionHeight;
        double sizeKb = sizeB / 1024;
        double sizeMb = sizeKb / 1024;

        System.out.println("File: " + fileName);
        System.out.println("Resolution: " + resolutionHeight + "x" + resolutionWidth);
        System.out.println("Size (kb): " + sizeKb + "kb");
        System.out.println("Size (Mb): " + sizeMb + "Mb");



    }
}
