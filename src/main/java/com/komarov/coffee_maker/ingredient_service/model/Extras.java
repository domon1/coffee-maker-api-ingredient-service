package com.komarov.coffee_maker.ingredient_service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

// TODO нужно продумать сущность для ингредиентов выбранных пользователем

@Getter
@Setter
@Entity
public class Extras implements Serializable { // selectedByDefault
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long itemId;

    @ManyToMany
    @JoinTable(
            name = "extras_ingredients",
            joinColumns = @JoinColumn(name = "extras_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private Set<Ingredient> ingredients = new HashSet<>();
}
