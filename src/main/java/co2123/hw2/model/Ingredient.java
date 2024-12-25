package co2123.hw2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ingredient {
    @Id
    private int identifier;
    private int amount;

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

    @Override
    public String toString() {
        return "Ingredient{" +
                "identifier='"+ identifier + '\'' +
                ", amount='"+ amount + '\'' +
                '}';
    }
}
