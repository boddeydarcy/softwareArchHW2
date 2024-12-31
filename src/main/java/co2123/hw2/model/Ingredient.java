package co2123.hw2.model;

import jakarta.persistence.*;

@Entity // jpa annotation for creating an Ingredient table
public class Ingredient {
    @Id // declaration of the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id will be automatically generated based on what is already there
    private int identifier;

    private int amount;

    // link the bread to the ingredient as one bread can have many ingredients but only one ingredient can belong to one bread
    @ManyToOne
    private Bread bread;

    // getters and setters
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getIdentifier() {
        return identifier;
    }

    public int getAmount() {
        return amount;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    // this will be the data displayed by the jsp
    @Override
    public String toString() {
        return "Ingredient{identifier="+ identifier + ", amount="+ amount + "}";
    }
}
