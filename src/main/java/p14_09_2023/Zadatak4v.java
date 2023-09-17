package p14_09_2023;

public class Zadatak4v {
    public static void main(String[] args) {
        InstagramUser vladimir = new InstagramUser("vladimir","Vladimir Bojčić", "vladimi@gmail.com");
        InstagramUser milan = new InstagramUser("milan","Milan Milan", "milan@gmail.com");
        InstagramUser zoran = new InstagramUser("zoran","Zoran Zoran", "zoran@gmail.com");

        InstagramPost album = new InstagramPost();
        album.addImage(new InstagramImage(1245,1845,"dfdjfdfhdsfhsfks"));

        album.addImage(new InstagramImage(100,100,"hhfghdgfjhfhj"));


    }

}
