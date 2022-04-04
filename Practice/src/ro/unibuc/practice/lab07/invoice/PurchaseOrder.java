package ro.unibuc.practice.lab07.invoice;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {

    private final String date;
    private final List<OrderItem> orderItems;

    public PurchaseOrder(String date) {
        this.date = date;
        orderItems = new ArrayList<>();
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public String getDate() {
        return date;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

}
