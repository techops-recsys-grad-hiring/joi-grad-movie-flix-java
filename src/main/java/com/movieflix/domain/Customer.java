package com.movieflix.domain;

public class Customer {
    private final String email;
    private final boolean isPremiumSubscription;
    private final Plan selectedPlan;

    public Customer(String email, boolean isPremiumSubscription) {
        this.email = email;
        this.isPremiumSubscription = isPremiumSubscription;
        this.selectedPlan = Plan.BASIC;
    }

    public String getEmail() {
        return email;
    }

    public boolean isPremiumSubscription() {
        return isPremiumSubscription;
    }

    public Plan getSelectedPlan() {
        return selectedPlan;
    }
}
