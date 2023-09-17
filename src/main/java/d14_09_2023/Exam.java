package d14_09_2023;

public class Exam {
    //    Napisati klasu Ispit koja ima
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za sve atribute
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)
    private String examName;
    private int examGrade;
    private String professorName;

    public Exam(String examName, int examGrade, String professorName) {
        this.examName = examName;
        this.examGrade = examGrade;
        this.professorName = professorName;
    }

    public boolean passOrFail(){
     if (this.getExamGrade()>5 && this.getExamGrade()<=10){
         return true;
     }else {
         return false;
     }
    }
    public void printExam(){
        System.out.println(this.getExamName() + " - " + this.getProfessorName() + " - " + this.getExamGrade());
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public int getExamGrade() {
        return examGrade;
    }

    public void setExamGrade(int examGrade) {
        this.examGrade = examGrade;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
}
