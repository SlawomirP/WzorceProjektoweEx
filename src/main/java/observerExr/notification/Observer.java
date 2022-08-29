package observerExr.notification;

import observerExr.order.Order;

public interface Observer {

    void update (Order order);
}
