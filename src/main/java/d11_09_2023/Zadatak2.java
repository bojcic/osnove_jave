package d11_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Korisnik vladimir = new Korisnik("Vladimir", "Bojčić");
        vladimir.printUser();
        FacebookPost post = new FacebookPost(vladimir);
        post.setPostText("Ajmo ljudi like share tap tap");
        post.printPost();
    }
}
