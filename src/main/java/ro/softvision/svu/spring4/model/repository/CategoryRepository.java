package ro.softvision.svu.spring4.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ro.softvision.svu.spring4.model.definition.Category;

/**
 * Repository for {@link Category}
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
