package d07_09_2023;

public class Zadatak1 {
//    Kreiranje klase "Student"
//    Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String). Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.
    public static void main(String[] args) {
        Student_zadatak1 student1 = new Student_zadatak1();
            student1.ime = "Kristijan Kamatović";
            student1.brojIndeksa = 20230907;
            student1.fakultet = "Privatni fakultet";
        Student_zadatak1 student2 = new Student_zadatak1();
            student2.ime = "Borko Gorko";
            student2.brojIndeksa = 20231312;
            student2.fakultet = "Ulični fakultet";
        Student_zadatak1 student3 = new Student_zadatak1();
            student3.ime = "Mirko Nemirko";
            student3.brojIndeksa = 20231389;
            student3.fakultet = "Životni fakultet";

        System.out.println(student1.ime + " - " + student1.fakultet + " - " + student1.brojIndeksa);
        System.out.println(student2.ime + " - " + student2.fakultet + " - " + student2.brojIndeksa);
        System.out.println(student3.ime + " - " + student3.fakultet + " - " + student3.brojIndeksa);
    }
}
