package ro.unibuc.practice.lab06.pizza;

import ro.unibuc.practice.lab06.menu.items.Item;
import ro.unibuc.practice.lab06.pizza.ingredients.PizzaIngredient;

import java.util.List;

public abstract class Pizza implements Item {

    private final String name;
    private final List<PizzaIngredient> ingredients;
    private final Double price;

    public Pizza(String name, List<PizzaIngredient> ingredients, Double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    @Override
    public void displayInformation(Integer index) {
        System.out.printf("%s. %s - %.2f$ \n", index, name, price);
        System.out.println(ingredients);
    }

    @Override
    public String getDisplayName() {
        return name;
    }
}
