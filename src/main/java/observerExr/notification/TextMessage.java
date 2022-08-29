package observerExr.notification;

import observerExr.order.Order;

public class TextMessage {

    public void updateOrderStatus(Order order) {
        System.out.println("SMS - Zamówienie nr: " + order.getOrderNumber() +
                " zmieniło status na: " + order.getOrderStatus());
    }
}
