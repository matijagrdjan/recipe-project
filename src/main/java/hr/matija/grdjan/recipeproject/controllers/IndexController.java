package hr.matija.grdjan.recipeproject.controllers;

import hr.matija.grdjan.recipeproject.controllers.domain.Category;
import hr.matija.grdjan.recipeproject.controllers.domain.UnitOfMeasure;
import hr.matija.grdjan.recipeproject.repositories.CategoryRepository;
import hr.matija.grdjan.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Category id is:" + categoryOptional.get().getId());
        System.out.println("Unit of measure id is:" + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
