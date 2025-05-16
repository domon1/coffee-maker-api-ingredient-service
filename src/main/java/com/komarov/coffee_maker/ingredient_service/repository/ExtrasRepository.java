package com.komarov.coffee_maker.ingredient_service.repository;

import com.komarov.coffee_maker.ingredient_service.model.Extras;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtrasRepository extends JpaRepository<Extras, Long> {
    @EntityGraph(attributePaths = {"ingredients"})
    @Query("select e from Extras e where e.itemId = :itemId")
    Extras findExtrasWithIngredientsByItemId(@Param("itemId") Long itemId);
}
