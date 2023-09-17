package p15_09_2023;

public class Profesor extends  Osoba{
    private String subjectName;
    private double salary;

    public Profesor() {
    }

    public Profesor(String subjectName, double salary) {
        this.subjectName = subjectName;
        this.salary = salary;
    }

    public Profesor(String fullName, String jmbg, String subjectName, double salary) {
        super(fullName, jmbg);
        this.subjectName = subjectName;
        this.salary = salary;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void salaryIncrease(double increase){
        this.salary= this.salary + (this.salary * (increase/100));
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Predmet : " + this.getSubjectName() + "Plata: " + this.getSalary());
    }
}
