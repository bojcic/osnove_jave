package p14_09_2023;

import java.util.ArrayList;

public class InstagramImage {
    private ArrayList<InstagramTag> tags = new ArrayList<>();
    private int pictureHeight;
    private int pictureWidth;
    private String pictureAddress;

    public InstagramImage(int pictureHeight, int pictureWidth, String pictureAddress) {
        this.tags=new ArrayList<InstagramTag>();
        this.pictureHeight = pictureHeight;
        this.pictureWidth = pictureWidth;
        this.pictureAddress = pictureAddress;
    }

    public void addTag (String pictureAddress,InstagramTag tag){
        this.tags.add(tag);

    }

    public int getPictureHeight() {
        return pictureHeight;
    }

    public void setPictureHeight(int pictureHeight) {
        this.pictureHeight = pictureHeight;
    }

    public int getPictureWidth() {
        return pictureWidth;
    }

    public void setPictureWidth(int pictureWidth) {
        this.pictureWidth = pictureWidth;
    }

    public String getPictureAddress() {
        return pictureAddress;
    }

    public void setPictureAddress(String pictureAddress) {
        this.pictureAddress = pictureAddress;
    }

    public ArrayList<InstagramTag> getTags() {
        return tags;
    }
}
