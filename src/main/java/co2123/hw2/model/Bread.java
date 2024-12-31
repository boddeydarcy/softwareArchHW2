package co2123.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bread {
    @Id // declaration of the primary key 'name'
    private String name;

    @ManyToMany // many breads can be made by many bakeries
    private List<Bakery> bakeries;

    // one bread can have many ingredients this will join the two tables together
    @OneToMany(mappedBy="bread",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingredient> ingredients;

    // one bread can have one filling
    @OneToOne(cascade = CascadeType.ALL)
    private Ingredient filling;

    // getters and setters
    public void setName(String name){
        this.name = name;
    }

    public void setBakeries(List<Bakery> bakeries){
        this.bakeries = bakeries;
    }

    public void setIngredients(List<Ingredient> ingredients) {
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

    // this will be the data displayed by the jsp
    @Override
    public String toString(){
        return "Bread{" +
                "name='"+ name + '\'' +
                ", ingredients='"+ ingredients + '\'' +
                ", filling='"+ filling + '\'' +
                '}';
    }
}
