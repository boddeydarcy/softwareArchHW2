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
    private BakeryRepository BakeryRepository;

    @Autowired
    private BreadRepository breadRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Ingredient ingredient = new Ingredient();
        ingredient.setAmount(2);
        ingredientRepository.save(ingredient);

        Bread bread = new Bread();
        bread.setName("White Sourdough");
        bread.setIngredients(Collections.singletonList(ingredient));
        bread.setFilling(ingredient);
        breadRepository.save(bread);

        Bakery bakery = new Bakery();
        bakery.setAddress("21 Baker St");
        bakery.setBreads(Collections.singletonList(bread));
        bakery.setNewest(bread);
        BakeryRepository.save(bakery);
    }
}
