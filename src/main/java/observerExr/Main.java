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

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println();

        order.changeOrderStatus(OrderStatus.WYSŁANE);

        System.out.println();

        order.unregisterObserver(email);

        order.changeOrderStatus(OrderStatus.ODEBRANE);
    }
}
