package p19_09_2023;

public abstract class Atleticar {
    private String firstName;
    private String lastName;
    protected double result;

    public Atleticar(String firstName, String lastName, double result) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.result = result;
    }

    public abstract boolean isBetter(Atleticar athlete);
    public void print(){
        System.out.println(this.getFirstName() + " " + this.getLastName() + ", " + this.getResult());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
