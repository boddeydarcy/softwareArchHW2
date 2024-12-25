package co2123.hw2.repo;

import co2123.hw2.model.Bakery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BakeryRepository extends CrudRepository<Bakery, Integer> {
    List<Bakery> findByAddress(String address);

    List<Bakery> findByBakeriesNewest(String name);
}
