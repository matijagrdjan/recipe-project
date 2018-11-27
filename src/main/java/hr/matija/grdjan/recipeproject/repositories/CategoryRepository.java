package hr.matija.grdjan.recipeproject.repositories;

import hr.matija.grdjan.recipeproject.controllers.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
