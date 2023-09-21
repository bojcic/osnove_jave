package p18_09_2023;

import java.util.ArrayList;

public class FigureGenerator {
    private ArrayList<Figura> figure = new ArrayList<>();
    public FigureGenerator() {
        figure=new ArrayList<>();

    }

    public Figura generate(String tip){
        Figura t;
        if (tip.equals("trougao")){
             t = new JednakostranicniTrougao(5);
        } else if (tip.equals("pravougaonik")) {
             t= new Pravougaonik(5,10);
        }else {return null;}
        return t;
    }
    public ArrayList<Figura> generateTrArray (int n){
        figure=new ArrayList<Figura>();
        for (int i = 0; i < n; i++) {
            figure.add(generate("trougao"));
        }
        return figure;
    }
    public ArrayList<Figura> generatePrArray (int n){
        figure=new ArrayList<Figura>();
        for (int i = 0; i < n; i++) {
            figure.add(generate("pravougaonik"));
        }
        return figure;
    }
    public ArrayList<Figura> generateBothArray (int n){
        figure=new ArrayList<Figura>();
        for (int i = 0; i < n; i++) {
            figure.add(generate("pravougaonik"));
            figure.add(generate("trougao"));
        }
        return figure;
    }
}
