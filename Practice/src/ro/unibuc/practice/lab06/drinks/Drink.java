package ro.unibuc.practice.lab06.drinks;

import ro.unibuc.practice.lab06.menu.items.Item;

public abstract class Drink implements Item {

    protected final String name;
    protected final String quantity;
    protected final Double price;

    public Drink(final String name, final String quantity, final Double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public void displayInformation(Integer index) {
        System.out.printf("%s. %s %s - %.2f$ \n", index, name, quantity, price);
    }

    @Override
    public String getDisplayName() {
        return String.format("%s %s", name, quantity);
    }
}