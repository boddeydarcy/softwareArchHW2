package co2123.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bread {
    @Id
    private String name;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "bakery_bread",
            joinColumns = @JoinColumn(name = "bread_name"),
            inverseJoinColumns = @JoinColumn(name = "bakery_id")
    )
    private List<Bakery> bakeries;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn
    private List<Ingredient> ingredients;
    @OneToOne
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
        return "Bread{" +
                "name='"+ name + '\'' +
                ", ingredients='"+ ingredients + '\'' +
                ", filling='"+ filling + '\'' +
                '}';
    }
}
