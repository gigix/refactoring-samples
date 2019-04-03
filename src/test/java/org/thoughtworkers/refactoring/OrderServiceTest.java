package org.thoughtworkers.refactoring;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OrderServiceTest {
    @Test
    public void should_calculate_premium_discount_amount() {
        OrderService orderService = new OrderService();
        double pda = orderService.getPremiumDiscountAmount(101);
        assertThat(pda, is(15.0));
    }
}
