package com.cooking.receipe.bootstrap;

import com.cooking.receipe.domain.Category;
import com.cooking.receipe.domain.Receipe;
import com.cooking.receipe.domain.UnitOfMeasure;
import com.cooking.receipe.repository.CategoryRepository;
import com.cooking.receipe.repository.ReceipeRepository;
import com.cooking.receipe.repository.UnitOfMeasureRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final CategoryRepository categoryRepository;
    private final ReceipeRepository receipeRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public Bootstrap(CategoryRepository categoryRepository, ReceipeRepository receipeRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.receipeRepository = receipeRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

    }

    private List<Receipe> getRecipes() {
        List<Receipe> receipes = new ArrayList<>(2);
        //Gets units measurement
        Optional<UnitOfMeasure> unitOne = unitOfMeasureRepository.findByDescription("Teaspoon");
        if (!unitOne.isPresent()) {
            throw new RuntimeException("Unit Teaspoon not found");
        }
        Optional<UnitOfMeasure> unitTwo = unitOfMeasureRepository.findByDescription("Pint");
        if (!unitTwo.isPresent()) {
            throw new RuntimeException("Unit Pint not pint");
        }

        Optional<UnitOfMeasure> unitThree = unitOfMeasureRepository.findByDescription("Pinch");
        if (!unitThree.isPresent()) {
            throw new RuntimeException("Unit Pinch not found");
        }

        Optional<UnitOfMeasure> unitFour = unitOfMeasureRepository.findByDescription("Cup");
        if (!unitFour.isPresent()) {
            throw new RuntimeException("Unit Cup not found");
        }
        //Get Unit measure  options
        UnitOfMeasure teaspoon = unitOne.get();
        UnitOfMeasure pint = unitTwo.get();
        UnitOfMeasure pinch = unitThree.get();
        UnitOfMeasure cup = unitFour.get();

        //Get Category
        Optional<Category> zimbabwe = categoryRepository.findByDescription("Zimbabwe");
        if (!zimbabwe.isPresent()) {
            throw new RuntimeException("Category Zimbabwe not found");
        }
        Optional<Category> tanzania = categoryRepository.findByDescription("Tanzania");
        if (!tanzania.isPresent()) {
            throw new RuntimeException("Category Tanzania not found");
        }

        Optional<Category> malawi = categoryRepository.findByDescription("Malawi");
        if (!malawi.isPresent()) {
            throw new RuntimeException("Category Malawi not found");
        }
        Optional<Category>nambia  = categoryRepository.findByDescription("Nambia");
        if (!nambia.isPresent()) {
            throw new RuntimeException("Category Nambia not found");
        }

        Category category =zimbabwe.get();
        Category categoryOne =tanzania.get();
        Category categoryTwo =malawi.get();
        Category categoryThree =nambia.get();




        Receipe sadza = new Receipe();


        return receipes;
    }




}











