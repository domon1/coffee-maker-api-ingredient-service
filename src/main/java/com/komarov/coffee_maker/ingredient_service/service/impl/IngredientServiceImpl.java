package com.komarov.coffee_maker.ingredient_service.service.impl;

import com.komarov.coffee_maker.ingredient_service.model.dto.IngredientDTO;
import com.komarov.coffee_maker.ingredient_service.repository.IngredientRepository;
import com.komarov.coffee_maker.ingredient_service.service.IngredientService;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService {
    final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public IngredientDTO findById(Long id) {
        return IngredientDTO.from(ingredientRepository.findById(id).orElseThrow(RuntimeException::new)); // TODO change on NotFoundException
    }
}
