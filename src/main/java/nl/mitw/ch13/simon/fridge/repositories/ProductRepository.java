package nl.mitw.ch13.simon.fridge.repositories;

import nl.mitw.ch13.simon.fridge.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
