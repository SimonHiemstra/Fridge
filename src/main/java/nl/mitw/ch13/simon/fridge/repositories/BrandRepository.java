package nl.mitw.ch13.simon.fridge.repositories;

import nl.mitw.ch13.simon.fridge.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
