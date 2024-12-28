package co2123.hw2.repo;

import co2123.hw2.model.Bread;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BreadRepository extends JpaRepository<Bread, String> {
    List<Bread> findByName(String name);
}
