package p19_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Disciplina skok = new Disciplina("Skok u dalj", "skok");
        Disciplina trk = new Disciplina("110m sa preponama", "trk");
        skok.addAtleticar(new Skakac("Vladimir","Bojčić",7.85));
    }
}
