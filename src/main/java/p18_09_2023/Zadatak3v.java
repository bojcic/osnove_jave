package p18_09_2023;

import java.util.ArrayList;

public class Zadatak3v {
    public static void main(String[] args) {
        FigureGenerator generator = new FigureGenerator();
        ArrayList<Figura> figure = new ArrayList<>();
        figure.add(generator.generate("trougao"));
        figure.add(generator.generate("trougao"));
        figure.add(generator.generate("pravougaonik"));
        figure.add(generator.generate("pravougaonik"));

        generator.generatePrArray(3);
        generator.generateTrArray(5);
        generator.generateBothArray(2);

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
        }
    }
}
