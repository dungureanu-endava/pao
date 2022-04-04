package ro.unibuc.practice.lab07.invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceSystem {

    private List<PurchaseOrder> purchaseOrders;

    public InvoiceSystem() {
        purchaseOrders = new ArrayList<>();
    }

    public void triggerProcess() {
        // TODO: Transform Purchase Order.csv to PurchaseOrder object and add it to purchaseOrders
    }

    public void displayInvoice() {
        // TODO: Display invoice for each Purchase Order and the total bill
    }

}
