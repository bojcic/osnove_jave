package p14_09_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        FacebookPost prvi = new FacebookPost("Vladimir Bojčić","Ko zna zašto je to dobro",new ArrayList<>());
        prvi.react(new Reakcija("smile","Marko Marković"));
        prvi.react(new Reakcija("cry","Janko Marković"));
        prvi.react(new Reakcija("like","Žarko Marković"));
        prvi.react(new Reakcija("heart","Darko Marković"));
        prvi.react(new Reakcija("cry","Darko Marković"));
        prvi.react(new Reakcija("like","Danko Marković"));
        prvi.react(new Reakcija("smile","Rajko Marković"));

        prvi.printPost();


    }
}
