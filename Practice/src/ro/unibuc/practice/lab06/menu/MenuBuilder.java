package ro.unibuc.practice.lab06.menu;

import ro.unibuc.practice.lab06.drinks.Coffee;
import ro.unibuc.practice.lab06.drinks.Drink;
import ro.unibuc.practice.lab06.drinks.Fanta;
import ro.unibuc.practice.lab06.drinks.Pepsi;
import ro.unibuc.practice.lab06.pizza.Pizza;
import ro.unibuc.practice.lab06.pizza.PizzaAiFunghi;
import ro.unibuc.practice.lab06.pizza.PizzaCapricciosa;
import ro.unibuc.practice.lab06.pizza.PizzaNapoletana;

import java.util.ArrayList;
import java.util.List;

public final class MenuBuilder {

    private MenuBuilder() {

    }

    public static Menu build() {
        Menu menu = new Menu();

        menu.setPizzaItems(createPizzaItems());
        menu.setDrinkItems(createDrinkItems());

        return menu;
    }

    private static List<Drink> createDrinkItems() {
        List<Drink> drinkItems = new ArrayList<>();

        drinkItems.add(new Coffee("Cappuccino", 2.5));
        drinkItems.add(new Coffee("Flat White", 2.7));
        drinkItems.add(new Pepsi("Can", 1.2));
        drinkItems.add(new Pepsi("Bottle", 2.0));
        drinkItems.add(new Fanta("Can", 1.3));
        drinkItems.add(new Fanta("Bottle", 2.2));

        return drinkItems;
    }

    private static List<Pizza> createPizzaItems() {
        List<Pizza> pizzaItems = new ArrayList<>();

        pizzaItems.add(new PizzaNapoletana());
        pizzaItems.add(new PizzaAiFunghi());
        pizzaItems.add(new PizzaCapricciosa());

        return pizzaItems;
    }

}
