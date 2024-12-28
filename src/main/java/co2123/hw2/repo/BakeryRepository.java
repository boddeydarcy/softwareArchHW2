package co2123.hw2.repo;

import co2123.hw2.model.Bakery;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BakeryRepository extends CrudRepository<Bakery, Integer> {
    List<Bakery> findByAddress(String address);

    List<Bakery> findByNewestName(String name);
}
