package com.komarov.coffee_maker.ingredient_service.controller;

import com.komarov.coffee_maker.ingredient_service.model.dto.IngredientCategoryDTO;
import com.komarov.coffee_maker.ingredient_service.service.IngredientCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/ingredient/category")
public class IngredientCategoryController {
    final IngredientCategoryService categoryService;

    public IngredientCategoryController(IngredientCategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<IngredientCategoryDTO>> findAll(){
        return ResponseEntity.ok(categoryService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<IngredientCategoryDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.findById(id));
    }
}
