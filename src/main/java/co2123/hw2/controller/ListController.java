package co2123.hw2.controller;

import co2123.hw2.repo.BakeryRepository;
import co2123.hw2.repo.BreadRepository;
import co2123.hw2.repo.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {

    @Autowired
    private BakeryRepository bakeryRepository;

    @Autowired
    private BreadRepository breadRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping(value= "/listBakery")
    public String listBakery(Model model) {
        // will add all of the repo data and the name to the model
        model.addAttribute("data", bakeryRepository.findAll());
        model.addAttribute("dataName", "Bakery");
        return "list"; // will show the list jsp
    }

    @GetMapping(value= "/listBread")
    public String listBread(Model model) {
        model.addAttribute("data", breadRepository.findAll());
        model.addAttribute("dataName", "Bread");
        return "list";
    }

    @GetMapping(value= "/listIngredient")
    public String listIngredient(Model model) {
        model.addAttribute("data", ingredientRepository.findAll());
        model.addAttribute("dataName", "Ingredient");
        return "list";
    }
}
