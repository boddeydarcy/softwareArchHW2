package co2123.hw2.repo;

import co2123.hw2.model.Bread;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BreadRepository extends CrudRepository<Bread, String> {
    List<Bread> findByName(String name);
}
