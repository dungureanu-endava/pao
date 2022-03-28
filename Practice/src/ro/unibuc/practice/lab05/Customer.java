package ro.unibuc.practice.lab05;

import static ro.unibuc.practice.lab05.Cocktail.MARTINI;
import static ro.unibuc.practice.lab05.Cocktail.MOJITO;

record OrderItem(Integer howMany, Cocktail cocktail) {

}

record Order(OrderItem[] items) {

}

public class Customer {

    public Order createOrder() {
        OrderItem[] orderItems = new OrderItem[] {
                new OrderItem(3, MOJITO),
                new OrderItem(5, MARTINI),
        };

        return new Order(orderItems);
    }

}
