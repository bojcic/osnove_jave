package d08_09_2023;

public class FacebookPost_zadatak2 {
    public String korisnikObjava;
    public String korisnikProfil;
    public String tekstPoruke;
    public int brojLajkova;
    public int brojDeljenja;

    public void like (){
        this.brojLajkova += 1;
    }
    public void dislike (){
        this.brojLajkova -= 1;
        if (this.brojLajkova<0){
            this.brojLajkova = 0;
        }
    }
    public void share (){
        this.brojDeljenja += 1;
    }
    public void print(){
        System.out.println(this.korisnikObjava + " >>> " + this.korisnikProfil);
        System.out.println(this.tekstPoruke);
        System.out.println("Likes: " + this.brojLajkova + " | Shares: " + this.brojDeljenja);
    }
}
