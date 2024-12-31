package co2123.hw2.controller;

import ch.qos.logback.core.model.Model;
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
    @Autowired
    private BakeryRepository bakeryRepository;

    @Autowired
    private BreadRepository breadRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("/deleteBakery")
    public String deleteBakery(@RequestParam int id) {
        bakeryRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/deleteBread")
    public String deleteBread(@RequestParam String name) {
        if(bakeryRepository.findByNewestName(name) != null) {
            for (Bakery bakery : bakeryRepository.findByNewestName(name)) {
                bakery.setNewest(null);
            }
        };
        breadRepository.deleteById(name);
        return "redirect:/";
    }

    @GetMapping("/deleteIngredient")
    public String deleteIngredient(@RequestParam int identifier) {
        List<Ingredient> ingredients = ingredientRepository.findByIdentifier(identifier);
        if(breadRepository.findByIngredients(ingredients).isPresent()){
            for (Bread bread : breadRepository.findAll()){
                bread.getIngredients().remove(ingredients.get(0));
                bread.setFilling(null);
            }
        }
        ingredientRepository.deleteById(identifier);
        return "redirect:/";
    }

}

