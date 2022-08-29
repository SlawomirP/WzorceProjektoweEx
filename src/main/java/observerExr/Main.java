package observerExr;

import observerExr.notification.Email;
import observerExr.notification.MobileApp;
import observerExr.notification.TextMessage;
import observerExr.order.Order;
import observerExr.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        textMessage.updateOrderStatus(order);
        mobileApp.updateOrderStatus(order);
        email.updateOrderStatus(order);

    }
}
