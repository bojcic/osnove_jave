package d12_09_2023;

public class FizickoLice {
    private String fullName;
    private int idCard;
    private int jmbg;
    private boolean loyalty;
    public FizickoLice (String fullName, int jmbg, boolean loyalty){
        this.fullName=fullName;
        this.jmbg=jmbg;
        this.loyalty=loyalty;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getJmbg() {
        return this.jmbg;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getIdCard() {
        return this.idCard;
    }

    public void setLoyalty(boolean loyalty) {
        this.loyalty = loyalty;
    }
    public boolean getLoyalty(){
        return this.loyalty;
    }
    public void printIndividual(){
        System.out.println(this.fullName + " | Broj LK: " + this.idCard);
    }
}
