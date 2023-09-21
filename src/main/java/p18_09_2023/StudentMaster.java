package p18_09_2023;

public class StudentMaster extends Student{
    public StudentMaster(String fullName, int indexNumber, int year) {
        super(fullName, indexNumber, year);
    }

    @Override
    public double tuition(){
        return 100000.0;
    }
    @Override
    public  boolean scholarship(){
        if (this.getYear()<2){
            return true;
        } else {
            return false;
        }
    }
}
