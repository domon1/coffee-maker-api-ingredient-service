package com.komarov.coffee_maker.ingredient_service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Extras implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private Long itemId; ???

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;
}
