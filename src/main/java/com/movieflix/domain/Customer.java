package com.movieflix.domain;

public class Customer {
    private String email;

    public Customer(String email, boolean isPremiumSubscription) {
        this.email = email;
        this.isPremiumSubscription = isPremiumSubscription;
    }

    private boolean isPremiumSubscription;

    public String getEmail() {
        return email;
    }

    public boolean isPremiumSubscription() {
        return isPremiumSubscription;
    }
}
