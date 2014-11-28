package ro.softvision.svu.spring4.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ro.softvision.svu.spring4.model.definition.Product;

/**
 * Repository for {@link Product}
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
