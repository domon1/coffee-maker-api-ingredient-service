package com.komarov.coffee_maker.ingredient_service.model.dto;

import com.komarov.coffee_maker.ingredient_service.model.IngredientCategory;

import java.util.List;

public record IngredientCategoryDTO(
        Long id,
        String name,
        Boolean isMultiplySelect,
        List<IngredientDTO> ingredients
) {
    public static IngredientCategoryDTO from(IngredientCategory ingredientCategory){
        return new IngredientCategoryDTO(
                ingredientCategory.getId(),
                ingredientCategory.getName(),
                ingredientCategory.getIsMultiplySelect(),
                ingredientCategory.getIngredients()
                        .stream().map(IngredientDTO::from).toList()
        );
    }
}
