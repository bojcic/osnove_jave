package d15_08_2023;

public class Zadatak10v_slack {
    public static void main(String[] args) {
//        Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se skine fajl.
//        Program od informacija cuva naziv fajla, velicinu fajla i brzinu skidanja. Velicina fajla je u Mb
//        a brzina skidana u Mb/s (megabajt u sekundi)
//        Primer izvrsenja
//        File: profile-image.log
//        Size: 25Mb
//        Download speed: 3Mb/s
//        Estimated time: 8s

        String fileName = "Rođa Raičević - A ja imam tebe.mp3";
        double fileSize = 13.2;
        int downSpeed = 2;
        double time = fileSize / downSpeed;

        System.out.println("File: " + fileName);
        System.out.println("Size: " + fileSize + "Mb");
        System.out.println("Download speed: " + downSpeed +"Mb/s");
        System.out.println("Estimated time: " + time + "s");
    }
}
