package d14_09_2023;

import java.util.ArrayList;

public class Student {
    //    Napisati klasu Student koja ima
//
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)
    private int indexNumber;
    private String fullName;
    private ArrayList<Exam> exams;
    private String studiesType;

    public Student(int indexNumber, String fullName, String studiesType) {
        this.exams=new ArrayList<>();
        this.indexNumber = indexNumber;
        this.fullName = fullName;
        this.studiesType = studiesType;
    }
    public void print(){
        System.out.println(this.getIndexNumber() + " - " + this.getFullName() + " - " + this.getStudiesType());
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.exams.size(); i++) {
            this.exams.get(i).printExam();
        }
        System.out.print("Prosek: " + this.average());
    }
    public double average(){
        int countPassed=0;
        int sumPassed=0;
        for (int i = 0; i < this.exams.size(); i++) {
            if (this.exams.get(i).passOrFail()){
                countPassed += 1;
                sumPassed += this.exams.get(i).getExamGrade();
            }

        }
        return 1.0*sumPassed/countPassed;


    }
    public void addExam(Exam exam){
        this.exams.add(exam);
    }
    public ArrayList<Exam> getExams() {
        return exams;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudiesType() {
        return studiesType;
    }

    public void setStudiesType(String studiesType) {
        this.studiesType = studiesType;
    }
}
