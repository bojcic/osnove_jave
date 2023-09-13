package p12_09_2023;

public class Korisnik {
    private String username;
    private String licence;
    public Korisnik (){
        this.licence = "basic";
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername (){
        return this.username;
    }
    public String getLicence(){
        return this.licence;
    }
    public void subscribe (int fee){
        if (fee == 100){
            this.licence = "pro";
        } else if (fee == 150) {
            this.licence = "premium";
        }
    }
    public void endSubscription (){
        this.licence = "basic";
    }
    public int maxDuration (){
        if (this.licence.equals("premium")){
            return 1440;
        } else if (this.licence.equals("pro")) {
            return 240;
        } else {
            return 40;
        }
    }
    public void print(){
        System.out.println(this.username);
    }
}
