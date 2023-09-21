package d18_09_2023;

public class VideoPlayer {
//    Kreirati klasu VideoPlayer koja ima:
//    duzinu videa
//    trenutno vreme videa
//    jacinu zvuka
//    Kvalitet videa (144, 240, 360, 480, 720, 1080)
//    gettere, settere i konstruktore
//    metodu stampaj koja stampa podatke u formatu:
//    trenutno vreme videa
//    jacina zvuka
//    kavlitet videa
    private int lenght;
    private int timeNow;
    private int volume;
    private int quality;

    public VideoPlayer(int lenght, int timeNow, int volume, int quality) {
        this.lenght = lenght;
        this.timeNow = timeNow;
        this.volume = volume;
        this.quality = quality;
    }
    public void printVideo(){
        System.out.println("Trenutno vreme videa: " + this.timeNow);
        System.out.println("Jačina zvuka: " + this.volume);
        System.out.println("Kvalitet: " + this.quality);
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getTimeNow() {
        return timeNow;
    }

    public void setTimeNow(int timeNow) {
        this.timeNow = timeNow;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
