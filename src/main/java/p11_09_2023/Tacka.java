package p11_09_2023;

public class Tacka {
    private int x;
    private int y;
    public Tacka(){

    }
    public Tacka(int x, int y){
        this.x=x;
        this.y=y;

    }
    public void setX(int x){
        this.x = x;
    }
    public int getX (){
        return this.x;
    }
    public void setY (int y){
        this.y = y;
    }
    public int getY(){
        return this.y;
    }
    public void stampaj(){
        System.out.println("X je " + this.x + " a Y je " + this.y);
    }
}
