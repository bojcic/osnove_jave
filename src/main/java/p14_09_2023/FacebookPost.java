package p14_09_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String postFullName;
    private String postText;
    private ArrayList<Reakcija> reactions;

    public FacebookPost(String postFullName, String postText, ArrayList<Reakcija> reactions) {
        this.postFullName = postFullName;
        this.postText = postText;
        this.reactions = reactions;
    }

    public FacebookPost(String postFullName, String postText) {

        this.postFullName = postFullName;
        this.postText = postText;

    }

    public void react(Reakcija reaction){
        for (int i = 0; i < this.reactions.size(); i++) {
            if (this.reactions.get(i).getReactFullName().equals(reaction.getReactFullName())){
                this.reactions.remove(i);
            }
        }
        this.reactions.add(reaction);
    }
    private int reactionCount(String reactionType){
        int counter = 0;
        for (int i = 0; i < this.reactions.size(); i++) {
            if (this.reactions.get(i).getReactionType().equals(reactionType)){
                counter+=1;
            }
        }
        return counter;
    }
    public void printPost(){
        System.out.println(this.postFullName);
        System.out.println(this.postText);
        if (this.reactionCount("smile") > 0){
            System.out.print("Smile " + this.reactionCount("smile") + " | ");
        } if (this.reactionCount("like") > 0) {
            System.out.print(" Like " + this.reactionCount("like") + " | ");
        }  if (this.reactionCount("heart") > 0) {
            System.out.print(" Srce |" + this.reactionCount("heart") + " | ");
        }  if (this.reactionCount("cry") > 0) {
            System.out.print(" Tužić " + this.reactionCount("cry"));
        }
    }

    public String getPostFullName() {
        return postFullName;
    }

    public void setPostFullName(String postFullName) {
        this.postFullName = postFullName;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public ArrayList<Reakcija> getReactions() {
        return reactions;
    }
}
