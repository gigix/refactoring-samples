package org.thoughtworkers.refactoring;

public class OrderService {
    public double getPremiumDiscountAmount(long orderId) {
        Order order = Order.load(orderId);
        return order.getPremiumDiscountAmount();
    }
}
