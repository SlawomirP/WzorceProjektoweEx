package observerExpl.notification;

import observerExpl.order.Order;

public interface Observer {

    void update (Order order);
}
