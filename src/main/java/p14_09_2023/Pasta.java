package p14_09_2023;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> ingredients;

    public Pasta() {
        this.ingredients=new ArrayList<>();
    }
    public void  addIngredient(Sastojak ingredient){
        this.ingredients.add(ingredient);
    }
    public void deleteIngredient(String name){
        for (int i = 0; i < this.ingredients.size(); i++) {
            if (this.ingredients.get(i).getName().equals(name)){
                this.ingredients.remove(this.ingredients.get(i));
            }
        }
    }
    public double pricePasta(){
        double totalPrice=0;
        for (int i = 0; i < this.ingredients.size(); i++) {
            totalPrice += this.ingredients.get(i).getPrice();
        }
        return totalPrice;
    }
    public void printPasta(){
        System.out.println("Sastojci u pasti su: ");
        for (int i = 0; i < this.ingredients.size(); i++) {
            this.ingredients.get(i).printSastojak();
        }
    }
}
