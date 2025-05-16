package com.komarov.coffee_maker.ingredient_service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Ingredient implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id")
    private IngredientCategory ingredientCategory;

    @ManyToMany(mappedBy = "ingredients")
    private Set<Extras> extras = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "ingredients_types",
            joinColumns = @JoinColumn(name = "ingredient_id"),
            inverseJoinColumns = @JoinColumn(name = "type_id")
    )
    private Set<IngredientType> ingredientTypes;
}
