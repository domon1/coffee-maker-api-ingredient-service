package com.komarov.coffee_maker.ingredient_service.service.impl;

import com.komarov.coffee_maker.ingredient_service.model.dto.IngredientCategoryDTO;
import com.komarov.coffee_maker.ingredient_service.repository.IngredientCategoryRepository;
import com.komarov.coffee_maker.ingredient_service.service.IngredientCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientCategoryServiceImpl implements IngredientCategoryService {
    final IngredientCategoryRepository categoryRepository;

    public IngredientCategoryServiceImpl(IngredientCategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<IngredientCategoryDTO> findAll() {
        return categoryRepository.findAll().stream().map(IngredientCategoryDTO::from).toList();
    }

    @Override
    public IngredientCategoryDTO findById(Long id) {
        return IngredientCategoryDTO.from(
                categoryRepository.findById(id)
                        .orElseThrow(RuntimeException::new)  // TODO change on NotFoundException
        );
    }
}
