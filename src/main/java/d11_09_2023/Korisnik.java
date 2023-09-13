package d11_09_2023;

public class Korisnik {
    private String firstName;
    private String lastName;
    public Korisnik(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void printUser(){
        System.out.println(this.firstName + " " + this.lastName);
    }
}

