package co2123.hw2.controller;

import co2123.hw2.model.Bakery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {
    @GetMapping(value= "/listBakery")
    public String listBakery(Model model) {
        model.addAttribute("data", "bakery");
        return "list";
    }

    @GetMapping(value= "/listBread")
    public String listBread(Model model) {
        model.addAttribute("data", "bread");
        return "list";
    }

    @GetMapping(value= "/listIngredient")
    public String listIngredient(Model model) {
        model.addAttribute("data", "ingredient");
        return "list";
    }

}
