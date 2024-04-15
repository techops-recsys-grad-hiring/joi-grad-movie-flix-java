package com.movieflix.domain;

public class BasicPlan {
    private double subscriptionCost = 19;
    private double taxPercentage = 20;

    public double charges() {
        return subscriptionCost + (subscriptionCost * (taxPercentage / 100));
    }
}
