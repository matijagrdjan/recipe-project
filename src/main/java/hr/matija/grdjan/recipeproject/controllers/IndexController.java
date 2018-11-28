package hr.matija.grdjan.recipeproject.controllers;

import hr.matija.grdjan.recipeproject.controllers.domain.Category;
import hr.matija.grdjan.recipeproject.controllers.domain.UnitOfMeasure;
import hr.matija.grdjan.recipeproject.repositories.CategoryRepository;
import hr.matija.grdjan.recipeproject.repositories.UnitOfMeasureRepository;
import hr.matija.grdjan.recipeproject.repositories.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}