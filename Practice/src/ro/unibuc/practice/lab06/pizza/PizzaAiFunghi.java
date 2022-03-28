package ro.unibuc.practice.lab06.pizza;

import java.util.List;

import static ro.unibuc.practice.lab06.pizza.ingredients.PizzaIngredient.*;

public class PizzaAiFunghi extends Pizza {

    public PizzaAiFunghi() {
        super("Pizza ai Funghi", List.of(TOMATO_SAUCE, CHAMPIGNON, PORCINO, MOZZARELLA, PARSLEY, OLIVE_OIL), 12.0);
    }

}
