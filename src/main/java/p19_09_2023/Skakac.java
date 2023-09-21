package p19_09_2023;

public class Skakac extends Atleticar{
    public Skakac(String firstName, String lastName, double result) {
        super(firstName, lastName, result);
    }
    @Override
    public boolean isBetter(Atleticar athlete){
        return this.getResult()>athlete.getResult();
    }
}
