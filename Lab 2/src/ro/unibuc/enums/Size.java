package ro.unibuc.enums;

public enum Size {

    SMALL,
    MEDIUM,
    LARGE,
    EXTRALARGE

}

class PizzaShop {

    public void orderPizza(final Size pizzaSize) {
        switch(pizzaSize) {
            case SMALL:
                System.out.println("I ordered a small size pizza.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium size pizza.");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
        }
    }

    public static void main(String[] args) {
        PizzaShop shop = new PizzaShop();
        shop.orderPizza(Size.MEDIUM);
    }

}