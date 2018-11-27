package hr.matija.grdjan.recipeproject.repositories;

import hr.matija.grdjan.recipeproject.controllers.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
