package d11_09_2023;

public class Autor {
    private String firstName;
    private String lastName;
    public Autor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void printFullName(){
        System.out.println(this.firstName + " " + this.lastName);
    }
}
