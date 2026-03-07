package org.example.service;

public class TuitionFeePayment {
    private double pricePerUnit = 1000.00;
    private double balance;
    private double totalTuition;

    public double calculateTuitionFee(int units, double discountRate){
        this.totalTuition = (pricePerUnit * units) - ((pricePerUnit * units)*discountRate);

        return this.totalTuition;
    }

    public void makePayment(double amount){
        if(amount >= balance)
            this.balance = 0;
        else
            this.balance -= amount;
    }

    public void getRemainingBalance(){
        System.out.println(this.balance);
    }

    public boolean isFullyPaid(){
        return this.balance == 0;
    }
}
