package co2123.hw2.repo;

import co2123.hw2.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
    List<Ingredient> findByAmount(int amount);

    List<Ingredient> findByIdentifier(int identifier);
}
