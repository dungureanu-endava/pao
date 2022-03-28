package ro.unibuc.practice.lab06.pizza;

import java.util.List;

import static ro.unibuc.practice.lab06.pizza.ingredients.PizzaIngredient.*;

public class PizzaCapricciosa extends Pizza {

    public PizzaCapricciosa() {
        super("Pizza Capricciosa", List.of(TOMATO_SAUCE, PROSCIUTTO_CRUDO, CHAMPIGNON, ARTICHOKE, MOZZARELLA, OLIVES), 15.0);
    }

}
