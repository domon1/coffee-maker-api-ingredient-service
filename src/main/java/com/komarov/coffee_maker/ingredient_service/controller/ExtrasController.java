package com.komarov.coffee_maker.ingredient_service.controller;

import com.komarov.coffee_maker.ingredient_service.model.dto.IngredientDTO;
import com.komarov.coffee_maker.ingredient_service.service.impl.ExtrasServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/ingredient/extras")
public class ExtrasController {
    final ExtrasServiceImpl extrasService;

    public ExtrasController(ExtrasServiceImpl extrasService) {
        this.extrasService = extrasService;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<List<IngredientDTO>> findDefaultSelectedIngredientsByItemId(@PathVariable Long id) {
        return ResponseEntity.ok(extrasService.findDefaultSelectedIngredientsByItemId(id));
    }
}
