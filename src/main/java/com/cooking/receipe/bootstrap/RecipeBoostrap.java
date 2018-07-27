
package com.cooking.receipe.bootstrap;

import com.cooking.receipe.domain.Receipe;
import com.cooking.receipe.domain.UnitOfMeasure;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import java.util.ArrayList;
import java.util.List;


import java.util.Optional;





public class RecipeBoostrap implements ApplicationListener<ContextRefreshedEvent> {


private final RecipeRepository recipeRepository;
private final CategoryRepository categoryRepository;
private final UnitOfMeasureRepository unitOfMeasureRepository;

public RecipeBoostrap(RecipeRepository recipeRepository, CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {


this.recipeRepository = recipeRepository;
this.categoryRepository = categoryRepository;
this.unitOfMeasureRepository = unitOfMeasureRepository;


}





@Override
public void onApplicationEvent(ContextRefreshedEvent event) {


}






private List<Receipe>getRecipes(){


List<Receipe> recipes = new ArrayList<>(2);





Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Cup");


if (!unitOfMeasure.isPresent()) {


throw new RuntimeException("Unit ");


}

















       return recipes;
    }


}



*/
