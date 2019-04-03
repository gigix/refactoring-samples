package org.thoughtworkers.refactoring;

public class Order {
    private final double totalAmount;
    private final boolean isPremium;

    public Order(double totalAmount, boolean isPremium) {
        this.totalAmount = totalAmount;
        this.isPremium = isPremium;
    }

    public double getPDA() {
        return getPremiumDiscountAmount();
    }

    public double getPremiumDiscountAmount() {
        return isPremium ? totalAmount * .15 : 0;
    }

    public static Order load(long orderId) {
        return new Order(100, true);
    }
}
