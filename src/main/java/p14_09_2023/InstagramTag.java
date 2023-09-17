package p14_09_2023;

public class InstagramTag {
    private InstagramUser tagged;
    private int coordinateX;
    private int coordinateY;

    public InstagramTag(InstagramUser tagged, int coordinateX, int coordinateY) {
        this.tagged = tagged;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public InstagramUser getTagged() {
        return tagged;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
}
