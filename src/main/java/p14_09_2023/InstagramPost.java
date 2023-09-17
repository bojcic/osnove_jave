package p14_09_2023;

import java.util.ArrayList;

public class InstagramPost {
    private ArrayList <InstagramImage> images = new ArrayList<>();
    private String description;

    public InstagramPost() {
        this.images=new ArrayList<InstagramImage>();
    }


    public void addImage (InstagramImage image){
        this.images.add(image);
    }
    public ArrayList<InstagramImage> getImages() {
        return images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
