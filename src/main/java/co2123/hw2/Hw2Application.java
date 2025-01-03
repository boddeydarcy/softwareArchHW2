package co2123.hw2;

import co2123.hw2.model.Bakery;
import co2123.hw2.model.Bread;
import co2123.hw2.model.Ingredient;
import co2123.hw2.repo.BakeryRepository;
import co2123.hw2.repo.BreadRepository;
import co2123.hw2.repo.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Hw2Application implements CommandLineRunner {

    @Autowired
    private BakeryRepository bakeryRepository;

    @Autowired
    private BreadRepository breadRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }

    @Override
    public void run(String... args) {
        // initializing test data for a bakery, bread and an ingredient
        Bakery bakery = new Bakery();
        bakery.setAddress("21 Baker St");

        Bread bread = new Bread();
        bread.setName("White Sourdough");

        Ingredient ingredient = new Ingredient();
        ingredient.setAmount(2);

        List<Ingredient> ingredients = List.of(ingredient);
        List<Bakery> bakeries = List.of(bakery);
        List<Bread> breads = List.of(bread);

        ingredient.setBread(bread);
        bread.setIngredients(ingredients);
        bread.setFilling(ingredient);
        bread.setBakeries(bakeries);
        bakery.setBreads(breads);
        bakery.setNewest(bread);
        bakeryRepository.save(bakery);
    }
}
