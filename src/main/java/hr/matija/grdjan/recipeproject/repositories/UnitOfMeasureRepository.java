package hr.matija.grdjan.recipeproject.repositories;

import hr.matija.grdjan.recipeproject.controllers.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

Optional<UnitOfMeasure> findByDescription(String description);
}
