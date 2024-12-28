package co2123.hw2.repo;

import co2123.hw2.model.Bread;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BreadRepository extends CrudRepository<Bread, String> {
    List<Bread> findByName(String name);
}
