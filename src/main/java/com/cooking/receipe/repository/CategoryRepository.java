package com.cooking.receipe.repository;

import com.cooking.receipe.domain.Category;
import com.cooking.receipe.domain.Category;
import com.cooking.receipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String description);
}
