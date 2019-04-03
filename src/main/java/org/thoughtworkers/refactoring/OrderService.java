package org.thoughtworkers.refactoring;

public class OrderService {

    public double getPDA(long orderId) {
        Order order = Order.load(orderId);
        return order.getPremiumDiscountAmount();
    }
}
