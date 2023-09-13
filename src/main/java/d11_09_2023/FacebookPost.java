package d11_09_2023;

public class FacebookPost {
    private String postText;
    private Korisnik user;
    public FacebookPost(Korisnik user){
        this.user=user;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostText() {
        return postText;
    }

    public Korisnik getUser() {
        return user;
    }
    public void printPost(){
        this.user.printUser();
        System.out.println(this.getPostText());
    }
}
