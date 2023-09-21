package p18_09_2023;

public class JednakostranicniTrougao extends Figura{
    private double a;

    public JednakostranicniTrougao(double a) {
        this.a = a;
    }
    @Override
    public double povrsina(){
        return (this.a*this.a)*1.73205/4;
    }
    @Override
    public double obim(){
        return this.a * 3.0;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
