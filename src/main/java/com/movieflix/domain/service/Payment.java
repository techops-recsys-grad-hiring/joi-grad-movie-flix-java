package com.movieflix.domain.service;

import com.movieflix.domain.Customer;
import com.movieflix.domain.PaymentType;

public class Payment {

    public double calculateCharge(Customer customer, PaymentType paymentType) {
        return customer.getSelectedPlan().charges() + paymentType.processingFee();
    }

}
