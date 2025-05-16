package com.komarov.coffee_maker.ingredient_service.service.impl;

import com.komarov.coffee_maker.ingredient_service.model.Extras;
import com.komarov.coffee_maker.ingredient_service.model.dto.IngredientDTO;
import com.komarov.coffee_maker.ingredient_service.repository.ExtrasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtrasServiceImpl {
    final ExtrasRepository extrasRepository;

    public ExtrasServiceImpl(ExtrasRepository extrasRepository) {
        this.extrasRepository = extrasRepository;
    }

    public List<IngredientDTO> findDefaultSelectedIngredientsByItemId(Long id) {
        Extras e = extrasRepository.findExtrasWithIngredientsByItemId(id);
        return e.getIngredients().stream().map(IngredientDTO::from).toList();
    }
}
