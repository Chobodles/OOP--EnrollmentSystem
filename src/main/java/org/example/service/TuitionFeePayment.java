package org.example.service;

public interface TuitionFeePayment {
    double PRICE_PER_UNIT = 1000.00;
    double calculateTuitionFee(int units, double discountRate);

    void makePayment(double amount);

    double getRemainingBalance();

    boolean isFullyPaid();
}
