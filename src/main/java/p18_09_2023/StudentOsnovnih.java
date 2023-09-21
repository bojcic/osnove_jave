package p18_09_2023;

public class StudentOsnovnih extends Student{
    public StudentOsnovnih(String fullName, int indexNumber, int year) {
        super(fullName, indexNumber, year);
    }

    @Override
    public double tuition(){
        return 90000.0;
    }
    @Override
    public  boolean scholarship(){
        if (this.getYear()<5){
            return true;
        } else {
            return false;
        }
    }
}
