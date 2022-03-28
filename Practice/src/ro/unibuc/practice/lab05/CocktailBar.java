package ro.unibuc.practice.lab05;

import static ro.unibuc.practice.lab05.Cocktail.*;

record MenuItem(Cocktail cocktail, Integer price) {

}

record Menu(MenuItem[] items) {

}

public class CocktailBar {

    private Menu menu;
    private Integer income;

    public CocktailBar() {
        menu = createMenu();
        income = 0;
    }

    private Menu createMenu() {
        MenuItem[] menuItems = new MenuItem[]{
                new MenuItem(MOJITO, 10),
                new MenuItem(MARTINI, 12),
                new MenuItem(DAIQUIRI, 13),
                new MenuItem(OLD_FASHIONED, 15)
        };

        return new Menu(menuItems);
    }

    public void placeOrder(Order order) {
        for (OrderItem orderItem : order.items()) {
            for (MenuItem menuItem : menu.items()) {
                if (orderItem.cocktail().equals(menuItem.cocktail())) {
                    income += orderItem.howMany() * menuItem.price();
                }
            }
        }
    }

    public Menu getMenu() {
        return menu;
    }

    public Integer getIncome() {
        return income;
    }

}
