package com.komarov.coffee_maker.ingredient_service.service;

import com.komarov.coffee_maker.ingredient_service.model.dto.IngredientDTO;
import org.springframework.stereotype.Service;

@Service
public interface IngredientService {
    IngredientDTO findById(Long id);
}
