package com.movieflix.domain;

public class UPIPayment implements PaymentType {
    @Override
    public double processingFee() {
        return 2;
    }
}
