package com.movieflix.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.movieflix.domain.Customer;
import com.movieflix.domain.PaymentType;
import com.movieflix.domain.UPIPayment;
import com.movieflix.domain.service.Payment;

public class PaymentTest {
    @Test
    void shouldCalculateChargesForBasicPlanAndUPIPaymentForNonpremiumCustomer() {
        PaymentType paymentType = new UPIPayment();
        Payment payment = new Payment();
        Customer customer = new Customer("test", false);

        double charges = payment.calculateCharge(customer, paymentType);

        assertEquals(24.8, charges);
    }
}
