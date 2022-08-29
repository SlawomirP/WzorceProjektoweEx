package observerExr.notification;

import observerExr.order.Order;

public class MobileApp implements Observer{

    public void update(Order order) {
        System.out.println("MobileApp - Zamówienie nr: " + order.getOrderNumber() +
                " zmieniło status na: " + order.getOrderStatus());
    }
}
