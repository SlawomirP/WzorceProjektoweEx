package observerExr.notification;

import observerExr.order.Order;

public class MobileApp {

    public void updateOrderStatus(Order order) {
        System.out.println("MobileApp - Zamówienie nr: " + order.getOrderNumber() +
                " zmieniło status na: " + order.getOrderStatus());
    }
}
