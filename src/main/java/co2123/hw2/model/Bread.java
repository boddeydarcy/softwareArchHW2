package co2123.hw2.model;

import java.util.List;

public class Bread {
    private String name;
    private List<Bakery> bakeries;
    private List<Ingredient> ingredients;
    private Ingredient filling;

    public void setName(String name){
        this.name = name;
    }

    public void setBakeries(List<Bakery> bakeries){
        this.bakeries = bakeries;
    }

    public void setIngredients(List<Ingredient> ingredients){
        this.ingredients = ingredients;
    }

    public void setFilling(Ingredient filling){
        this.filling = filling;
    }

    public String getName(){
        return name;
    }

    public List<Bakery> getBakeries(){
        return bakeries;
    }

    public List<Ingredient> getIngredients(){
        return ingredients;
    }

    public Ingredient getFilling(){
        return filling;
    }

    @Override
    public String toString(){
        return "name='"+ name + "', "
    }
}
