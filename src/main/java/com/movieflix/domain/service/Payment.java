package com.movieflix.domain.service;

import com.movieflix.domain.BasicPlan;
import com.movieflix.domain.Customer;
import com.movieflix.domain.PaymentType;

public class Payment {

    public double calculateCharge(Customer customer, PaymentType paymentType) {
        BasicPlan basicPlan = new BasicPlan();
        return basicPlan.charges() + paymentType.processingFee();
    }

}
