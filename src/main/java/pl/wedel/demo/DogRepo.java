package pl.wedel.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface DogRepo extends JpaRepository<Dog, Long> {
}
