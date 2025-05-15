package com.komarov.coffee_maker.ingredient_service.model.dto;

import com.komarov.coffee_maker.ingredient_service.model.Ingredient;

import java.math.BigDecimal;

public record IngredientDTO(
        Long id,
        String imageUrl,
        String name,
        BigDecimal price
) {
    public static IngredientDTO from(Ingredient ingredient){
        return new IngredientDTO(
                ingredient.getId(),
                ingredient.getImageUrl(),
                ingredient.getName(),
                ingredient.getPrice()
        );
    }
}
