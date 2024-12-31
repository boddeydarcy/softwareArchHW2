package co2123.hw2.repo;

import co2123.hw2.model.Bread;
import co2123.hw2.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BreadRepository extends CrudRepository<Bread, String> {
    List<Bread> findByName(String name);

    Optional<Object> findByIngredients(List<Ingredient> ingredients);

}
