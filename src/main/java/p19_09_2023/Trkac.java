package p19_09_2023;

public class Trkac extends Atleticar{
    public Trkac(String firstName, String lastName, double result) {
        super(firstName, lastName, result);
    }
    @Override
    public boolean isBetter(Atleticar athlete){
        return this.getResult()<athlete.getResult();
    }
}
