package ro.unibuc.practice.lab06.pizza;

import java.util.List;

import static ro.unibuc.practice.lab06.pizza.ingredients.PizzaIngredient.*;

public class PizzaNapoletana extends Pizza {

    public PizzaNapoletana() {
        super("Pizza Napoletana", List.of(TOMATO, MOZZARELLA, BASIL, OLIVE_OIL, OREGANO), 13.5);
    }

}