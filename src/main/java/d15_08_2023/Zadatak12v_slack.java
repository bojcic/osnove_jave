package d15_08_2023;

public class Zadatak12v_slack {
    public static void main(String[] args) {
//        Napisati program za promenu velicine slike na osnovu cuvanih podataka. Program cuva sledece informacije:
//        Naziv slike
//        Rezoluciju (duzina i visina)
//        Faktor skaliranja
//        Na osnovu faktora skaliranja, program će odluciti hoce li sliku smanjiti ili povecati.
//        Evo teorijskih primera za faktor skaliranja:
//        ako je originalna slika 1920x1080, a faktor skaliranja 0.8, slika ce se smanjiti za 20% i rezolucija ce postati
//        1536x864.
//        S druge strane, ako je faktor skaliranja 1.3, slika ce se povecati za 30% i rezolucija ce postati 2496x1404.
//        Na kraju programa, prikazati velicinu svake slike u megabajtima (MB). Naziv nove slike se dobija dodavanjem
//        prefiksa "resized-" originalnom nazivu.
//        Primer izvrsenja:
//        Original image: profile-image.png  Size: 1.977Mb
//        Scale: 1.3
//        Resized image: resized-profile-image.png Size: 3.342Mb
//                | Click here to Download image |

        String fileName = "Portret Tee Tairović";
        int resolutionHeight = 2000;
        int resolutionWidth = 2000;
        int sizeB = resolutionWidth * resolutionHeight;
        double sizeKb = sizeB / 1024;
        double sizeMb = sizeKb / 1024;
        double scalingFactor = 0.8;
        double resizedResolutionWidth = resolutionWidth * scalingFactor;
        double resizedResolutionHeight = resolutionHeight * scalingFactor;
        double resizedSizeB = resizedResolutionHeight * resizedResolutionWidth;
        double resizedSizeKb = resizedSizeB / 1024;
        double resizedSizeMb = resizedSizeKb / 1024;

        System.out.print("Original image: " + fileName + " ");
        System.out.println("Size: " + sizeMb + "Mb");
        System.out.println("Scale: " + scalingFactor);
        System.out.print("Resized image: resized-" + fileName + " ");
        System.out.println("Size: " + resizedSizeMb + "Mb");













    }
}
