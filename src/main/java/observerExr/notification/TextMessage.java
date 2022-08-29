package observerExr.notification;

import observerExr.order.Order;

public class TextMessage implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("SMS - Zamówienie nr: " + order.getOrderNumber() +
                " zmieniło status na: " + order.getOrderStatus());
    }
}
