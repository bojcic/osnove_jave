package p12_09_2023;

public class ZoomCall {
    private String url;
    private String password;
    private Korisnik host;
    private Korisnik guest;
    public ZoomCall (String url, String password, Korisnik host){
        this.url = url;
        this.password = password;
        this.host = host;
    }
    public String getUrl(){
        return this.url;
    }
    public String getPassword(){
        return this.password;
    }
    public Korisnik getHost(){
        return this.host;
    }
    public void setGuest(Korisnik guest){
        this.guest = guest;
    }
    public Korisnik getGuest(){
        return this.guest;
    }
    public void print(){
        System.out.println("Zoom Call: " + this.url);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.getHost().getUsername());
        System.out.println("Guest: " + this.getGuest().getUsername());
        System.out.println("Maksimalno trajanje poziva je " + this.getHost().maxDuration() + " minuta.");
    }
}
