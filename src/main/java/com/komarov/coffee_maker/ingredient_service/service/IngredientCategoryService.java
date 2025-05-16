package com.komarov.coffee_maker.ingredient_service.service;

import com.komarov.coffee_maker.ingredient_service.model.dto.IngredientCategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IngredientCategoryService {
    List<IngredientCategoryDTO> findAll();
    IngredientCategoryDTO findById(Long id);
    List<IngredientCategoryDTO> findCategoriesByItemTypeId(Long id);
}
