package com.komarov.coffee_maker.ingredient_service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
public class IngredientType implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "ingredientTypes")
    private Set<Ingredient> ingredients;
}
