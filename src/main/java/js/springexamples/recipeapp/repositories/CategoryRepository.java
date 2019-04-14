package js.springexamples.recipeapp.repositories;

import js.springexamples.recipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
