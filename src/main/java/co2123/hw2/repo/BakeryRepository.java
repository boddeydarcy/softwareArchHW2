package co2123.hw2.repo;

import co2123.hw2.model.Bakery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BakeryRepository extends JpaRepository<Bakery, Integer> {
    List<Bakery> findByAddress(String address);

    List<Bakery> findByNewestName(String name);
}
