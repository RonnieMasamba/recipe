package com.cooking.receipe.repository;

import com.cooking.receipe.domain.Receipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ReceipeRepository extends CrudRepository<Receipe,Long> {

    Optional<Receipe> findByDescription(String description);
}
