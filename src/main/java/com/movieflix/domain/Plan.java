package com.movieflix.domain;

public enum Plan {

    BASIC(19);

    private final double subscriptionCost;
    private final double taxPercentage;

    Plan(double subscriptionCost) {
        this.subscriptionCost = subscriptionCost;
        this.taxPercentage = 20;
    }

    public double charges() {
        return this.subscriptionCost + (this.subscriptionCost * (this.taxPercentage / 100));
    }

}
