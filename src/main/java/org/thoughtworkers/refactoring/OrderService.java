package org.thoughtworkers.refactoring;

public class OrderService {

    @Deprecated
    /**
     * @deprecated
     * Replaced by getPremiumDiscountAmount
     * To be removed at May 10th
     */
    public double getPDA(long orderId) {
        return getPremiumDiscountAmount(orderId);
    }

    public double getPremiumDiscountAmount(long orderId) {
        Order order = Order.load(orderId);
        return order.getPremiumDiscountAmount();
    }
}
