package d12_09_2023;

public class ZeleniKarton {
    private String studentFullName;
    private String professorFullName;
    private int index;
    private String className;
    private int grade;
    public ZeleniKarton (String studentFullName, int index, String className, String professorFullName, int grade){
        this.studentFullName=studentFullName;
        this.index=index;
        this.className=className;
        this.professorFullName=professorFullName;
        this.grade=grade;
    }
    public boolean hasPassed(){
        if (this.grade > 5 && this.grade <= 10){
            return true;
        } else {
            return false;
        }
    }
    public void averageGrade(){

    }
    public void printExam(){
        System.out.println(this.className + " - Ocena: " + this.grade);
        System.out.println("Student: " + this.studentFullName + ", Indeks: " + this.index);
        System.out.println("Profesor: " + this.professorFullName);
    }


    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setProfessorFullName(String professorFullName) {
        this.professorFullName = professorFullName;
    }

    public String getProfessorFullName() {
        return professorFullName;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}

