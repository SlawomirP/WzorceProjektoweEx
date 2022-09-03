package observerExpl.order;

import observerExpl.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable{
    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObservers = new HashSet<>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }
    public Long getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
    @Override
    public void registerObserver(Observer observer) {
        this.registeredObservers.add(observer);
    }
    @Override
    public void unregisterObserver(Observer observer) {
        this.registeredObservers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for(Observer observer: registeredObservers){
            observer.update(this);
        }
    }
    public void changeOrderStatus(OrderStatus orderStatus){
        setOrderStatus(orderStatus);
        notifyObservers();
    }
}
