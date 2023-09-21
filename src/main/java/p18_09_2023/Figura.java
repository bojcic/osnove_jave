package p18_09_2023;

public abstract class Figura {
    public abstract double povrsina();
    public abstract double obim();
    public void stampaj(){
        System.out.println("Površina je " + this.povrsina());
        System.out.println("Obim je " + this.obim());
    }

}
