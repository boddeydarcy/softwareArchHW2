package co2123.hw2.controller;

import ch.qos.logback.core.model.Model;
import co2123.hw2.model.Ingredient;
import co2123.hw2.repo.BakeryRepository;
import co2123.hw2.repo.BreadRepository;
import co2123.hw2.repo.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        return "redirect:/deleteBakery";
    }

    @GetMapping("/deleteBread")
    public String deleteBread(@RequestParam String name) {
        breadRepository.deleteById(name);
        return "redirect:/deleteBread";
    }

    @GetMapping("/deleteIngredient")
    public String deleteIngredient(@RequestParam int identifier) {
        ingredientRepository.deleteById(identifier);
        return "redirect:/deleteIngredient";
    }

}

