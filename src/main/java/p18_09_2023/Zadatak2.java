package p18_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        StudentOsnovnih vladimir = new StudentOsnovnih("Vladimir Bojčić", 20231809, 6);
        StudentMaster dragan = new StudentMaster("Dragan Draganović", 20215425, 1);

        vladimir.print();
        dragan.print();
    }
}
