package p15_09_2023;

public class Student extends Osoba {
    private String indexNumber;
    private double debt;

    public Student() {
    }

    public Student(String fullName, String jmbg, String indexNumber, double debt) {
        super(fullName, jmbg);
        this.indexNumber = indexNumber;
        this.debt = debt;
    }


    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }
    public void payTuition(double payment){
        this.debt=this.debt-payment;
    }
    public void print(){
        super.print();
        System.out.println("Broj indeksa: " + this.getIndexNumber() + "Duguje: " + this.getDebt() + " RSD");
    }
}
