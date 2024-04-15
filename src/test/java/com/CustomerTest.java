package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.movieflix.domain.Customer;

public class CustomerTest {
    @Test
    void shouldCreateNonPremiumCustomer() {
        Customer customer = new Customer("test", false);

        assertEquals(customer.getEmail(), "test");
        assertEquals(customer.isPremiumSubscription(), false);

        assertEquals("test", customer.getEmail());
        assertEquals(false, customer.isPremiumSubscription());
    }

    @Test
    void shouldCreatePremiumCustomer() {
        Customer customer = new Customer("test", true);

        assertEquals("test", customer.getEmail());
        assertEquals(true, customer.isPremiumSubscription());
    }

}
