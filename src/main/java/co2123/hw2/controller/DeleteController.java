package co2123.hw2.controller;

import co2123.hw2.model.Bakery;
import co2123.hw2.model.Bread;
import co2123.hw2.model.Ingredient;
import co2123.hw2.repo.BakeryRepository;
import co2123.hw2.repo.BreadRepository;
import co2123.hw2.repo.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DeleteController {
    // inject the repositories into the controller
    @Autowired
    private BakeryRepository bakeryRepository;

    @Autowired
    private BreadRepository breadRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("/deleteBakery")
    public String deleteBakery(@RequestParam int id) {
        bakeryRepository.deleteById(id); // will delete everything associated with the bakery
        return "redirect:"; // redirects back to localhost:8080
    }

    @GetMapping("/deleteBread")
    public String deleteBread(@RequestParam String name) {
        if(bakeryRepository.findByNewestName(name) != null) { // checks if bakeries newest name is name given
            for (Bakery bakery : bakeryRepository.findByNewestName(name)) {
                // will loop through the bakeries in the repo, and when the bakeries newest matches it will set it to null
                bakery.setNewest(null);
            }
        }
        breadRepository.deleteById(name); // bread that matches the name from the repo is deleted
        return "redirect:";
    }

    @GetMapping("/deleteIngredient")
    public String deleteIngredient(@RequestParam int identifier) {
        List<Ingredient> ingredient = ingredientRepository.findByIdentifier(identifier); // get the ingredient list that has identifier in it
        Ingredient filling = ingredient.get(0); // single out the ingredient from the list

        for (Bread bread : breadRepository.findAll()) { // loop through all the breads in the repo
            if (bread.getFilling() == filling) {
                // if bread's filling matches the ingredient to be deleted, it will set it to null
                bread.setFilling(null);
            }
        }
        ingredientRepository.deleteById(identifier); // ingredient is deleted
        return "redirect:";
    }
}

