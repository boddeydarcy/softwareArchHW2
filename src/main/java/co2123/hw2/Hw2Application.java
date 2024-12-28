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

import java.security.cert.CertPathValidatorException;
import java.util.Collections;

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
        Bakery bakery = new Bakery();
        bakery.setAddress("21 Baker St");

        Bread bread = new Bread();
        bread.setName("White Sourdough");

        Ingredient ingredient = new Ingredient();
        ingredient.setAmount(2);

        ingredient.setBread(bread);
        bread.setIngredients(Collections.singletonList(ingredient));
        bread.setBakeries(Collections.singletonList(bakery));
        bakery.setBreads(Collections.singletonList(bread));
        bakeryRepository.save(bakery);
    }
}
