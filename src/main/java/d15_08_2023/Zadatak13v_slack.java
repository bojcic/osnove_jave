package d15_08_2023;

public class Zadatak13v_slack {
    public static void main(String[] args) {

//        Napisati program koji simulira ponasanje auto video quality funkcionalnost na youtube-u.
//        Program od informacija ima:
//        naziv videa
//        duzinu fajla u sekundama (npr: ako video traje 2:29, cuva se 149s)
//        broj frame-ova  po sekundi
//        rezoluciju (duzina x visina frame-a)
//        Teorija: Frame je jedna slika u videu date rezolucije. video se sastoji od niza frame-ova i obicno se po
//        sekundi prikaze od 20 do 30 frame-a, zavisno od samog videa. Npr: ako imate video koji traje 5s
//        rezolucije 1920x1080 sa 10 frame-a po sekundi, to znaci da se u jednoj sekundi prikazu 10frama sto ce biti
//        na po 100 milisekundi jedna slika.
//        Program racuna minimalan internet protok po sekundi potreban za datu rezoluciju. Minimalan internet protok je
//        protok koji moze da ucita sekundu videa u sekundi. Minimalni protok treba da bude izrazen u Mb/s
//        Dodatno program isposuje informacije u odredjenom formatu.
//        Napomena: Informacija za duzinu videa treba da bude u formatu minuti:sekunde
//        Primer izvrsenja:
//        Tea Tairović - Bibi Habibi (Official Video | Album Balerina)
//        2:29   <| | | | |
//        Number of frames per second: 20
//        Resolution: 1920x1080
//        Minimal network speed: 39Mb/s

        String fileName = "Rođa Raičević - Dabogda";
        int videoMinutes = 2;
        int videoSeconds = 29;
        int videoLength = (videoMinutes * 60) + videoSeconds;
        int framePerSecond = 20;
        int resolutionHeight = 1920;
        int resolutionWidth = 1080;
        double sizeB = resolutionWidth * resolutionHeight;
        double sizeKb = sizeB / 1024;
        double sizeMb = sizeKb / 1024;
        double minFlow = sizeMb / videoLength;

        System.out.println(fileName);
        System.out.println(videoMinutes + ":" + videoSeconds + " <| | | | |");
        System.out.println("Number of frames per second: " + framePerSecond);
        System.out.println("Resolution: " + resolutionHeight + "x" + resolutionWidth);
        System.out.println("Minimal network speed: " + minFlow + "Mb/s");








    }
}
