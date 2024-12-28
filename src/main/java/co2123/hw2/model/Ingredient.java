package co2123.hw2.model;

import jakarta.persistence.*;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identifier;
    private int amount;

    @ManyToOne
    @JoinColumn
    private Bread bread;

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

    @Override
    public String toString() {
        return "Ingredient{" +
                "identifier='"+ identifier + '\'' +
                ", amount='"+ amount + '\'' +
                '}';
    }
}
