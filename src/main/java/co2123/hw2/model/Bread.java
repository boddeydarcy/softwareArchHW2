package co2123.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bread {
    @Id
    private String name;

    @ManyToMany
    private List<Bakery> bakeries;

    @OneToMany(mappedBy="bread",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingredient> ingredients;

    @OneToOne(cascade = CascadeType.ALL)
    private Ingredient filling;

    public void setName(String name){
        this.name = name;
    }

    public void setBakeries(List<Bakery> bakeries){
        this.bakeries = bakeries;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        for (Ingredient ingredient : ingredients) {
            ingredient.setBread(this);
        }
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
        return "Bread{" +
                "name='"+ name + '\'' +
                ", ingredients='"+ ingredients + '\'' +
                ", filling='"+ filling + '\'' +
                '}';
    }
}
