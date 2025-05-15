package com.komarov.coffee_maker.ingredient_service.repository;

import com.komarov.coffee_maker.ingredient_service.model.IngredientCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientCategoryRepository extends JpaRepository<IngredientCategory, Long> {
}
