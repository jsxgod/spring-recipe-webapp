package js.springexamples.recipeapp.services;

import js.springexamples.recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
