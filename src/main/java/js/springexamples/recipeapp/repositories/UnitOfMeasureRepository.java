package js.springexamples.recipeapp.repositories;

import js.springexamples.recipeapp.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findById(Long id);

    Optional<UnitOfMeasure> findByUnit(String unit);
}
