package p18_09_2023;

public abstract class Student {
    private String fullName;
    private int indexNumber;
    private int year;

    public Student() {
    }

    public Student(String fullName, int indexNumber, int year) {
        this.fullName = fullName;
        this.indexNumber = indexNumber;
        this.year = year;
    }
    public abstract double tuition();
    public abstract boolean scholarship();
    public void print(){
        System.out.println(this.getFullName() + ", " + this.getIndexNumber() + ", " + this.getYear());
        System.out.print("Finansiranje: ");
        if (this.scholarship()){
            System.out.println("budžet");
        }else {
            System.out.println("samofinansiranje");
        }
        System.out.println("Cena školarine: " + this.tuition());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
