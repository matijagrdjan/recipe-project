package hr.matija.grdjan.recipeproject.repositories.services;

import hr.matija.grdjan.recipeproject.controllers.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}