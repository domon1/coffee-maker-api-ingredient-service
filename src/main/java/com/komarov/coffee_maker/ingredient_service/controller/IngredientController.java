package com.komarov.coffee_maker.ingredient_service.controller;

import com.komarov.coffee_maker.ingredient_service.service.IngredientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/ingredient")
public class IngredientController {
    final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(ingredientService.findById(id));
    }

    @GetMapping(path = "/item/{id}")
    public ResponseEntity<?> findDefaultSelectedIngredientsByItemId(@PathVariable Long id) {
        return ResponseEntity.ok(ingredientService.findDefaultSelectedIngredientsByItemId(id));
    }
}
