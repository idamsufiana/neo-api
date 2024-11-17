package id.co.neo.repository;

import id.co.neo.model.entity.Asteroid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsteroidRepository extends JpaRepository<Asteroid, Long> {
}
