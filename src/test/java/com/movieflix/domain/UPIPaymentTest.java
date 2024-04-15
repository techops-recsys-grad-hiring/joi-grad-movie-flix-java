package com.movieflix.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UPIPaymentTest {
    @Test
    void shouldReturnProcessingFeesForUPIPayment() {
        PaymentType paymentType = new UPIPayment();

        double processingFee = paymentType.processingFee();

        assertEquals(2, processingFee);
    }
}
