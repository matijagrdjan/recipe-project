package hr.matija.grdjan.recipeproject.services;

import hr.matija.grdjan.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);
}