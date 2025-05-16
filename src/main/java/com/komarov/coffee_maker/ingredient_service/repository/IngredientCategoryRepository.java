package com.komarov.coffee_maker.ingredient_service.repository;

import com.komarov.coffee_maker.ingredient_service.model.IngredientCategory;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientCategoryRepository extends JpaRepository<IngredientCategory, Long> {
    @NonNull
    @Query("select ic from IngredientCategory ic join fetch ic.ingredients")
    List<IngredientCategory> findAll();

    @Query("select distinct ic from IngredientCategory ic " +
            "join fetch ic.ingredients i " +
            "join i.ingredientTypes it " +
            "where it.id = :typeId order by ic.id")
    List<IngredientCategory> findCategoriesWithIngredientsByTypeId(@Param("typeId") Long typeId);

}
