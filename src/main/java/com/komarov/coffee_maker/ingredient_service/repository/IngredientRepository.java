package com.komarov.coffee_maker.ingredient_service.repository;

import com.komarov.coffee_maker.ingredient_service.model.Ingredient;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    @EntityGraph(attributePaths = {"extras"})
    @Query("select distinct i from Ingredient i join i.extras e where e.itemId = :id")
    List<Ingredient> findDefaultSelectedIngredientsByItemId(Long id);
}
