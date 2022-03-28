package ro.unibuc.practice.lab06.menu;

import ro.unibuc.practice.lab06.drinks.Drink;
import ro.unibuc.practice.lab06.menu.items.Item;
import ro.unibuc.practice.lab06.pizza.Pizza;
import ro.unibuc.practice.lab06.utils.ItemUtils;

import java.util.List;

public class Menu {

    private List<Pizza> pizzaItems;
    private List<Drink> drinkItems;

    public void displayOptions() {
        System.out.println("1. Pizzas");
        System.out.println("2. Drinks");
    }

    public void displayOptions(int menuIndex) {
        ItemUtils.displayItems(getMenuItems(menuIndex));
    }

    private List<? extends Item> getMenuItems(int menuIndex) {
        return switch (menuIndex) {
            case 1 -> pizzaItems;
            case 2 -> drinkItems;
            default -> null;
        };
    }

    public Item getOrderItem(int menuIndex, int itemsIndex) {
        return getMenuItems(menuIndex).get(itemsIndex - 1);
    }

    public void setPizzaItems(List<Pizza> pizzaItems) {
        this.pizzaItems = pizzaItems;
    }

    public void setDrinkItems(List<Drink> drinkItems) {
        this.drinkItems = drinkItems;
    }
}
