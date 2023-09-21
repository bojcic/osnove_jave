package p19_09_2023;

import java.util.ArrayList;

public class Disciplina {
    private String sportName;
    private String sportType;
    private ArrayList<Atleticar> atleticari;

    public Disciplina(String sportName, String sportType) {
        atleticari=new ArrayList<>();
        this.sportName = sportName;
        this.sportType = sportType;
    }
    public void addAtleticar(Atleticar atleticar){
        this.atleticari.add(atleticar);
    }
    public void disqualify(String firstName, String lastName){
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).getFirstName().equals(firstName) && this.atleticari.get(i).getLastName().equals(lastName)){
                this.atleticari.remove(this.atleticari.get(i));
            }
        }
    }
    public Atleticar bestAthlete(){
        Atleticar best=this.atleticari.get(0);
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).isBetter(best)){
                best=this.atleticari.get(i);
            }
        }
        return best;
    }
    public void winner(String sportType){
        Atleticar winner = this.bestAthlete();
        System.out.println(winner.getFirstName() + " " + winner.getLastName() + ", " + winner.getResult());


    }
    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }
}
