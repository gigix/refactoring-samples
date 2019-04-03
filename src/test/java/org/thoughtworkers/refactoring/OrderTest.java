package org.thoughtworkers.refactoring;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OrderTest {
    @Test
    public void order_should_know_premium_discount_amount() {
        Order order = new Order(1000.0, true);
        assertThat(order.getPDA(), is(150.0));
    }
}
