package com.testjavaapp.uzticket;

public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("PAYMENT SYSTEM STRIPE");
        System.out.printf("Amount: %s \n", amount);
    }
}
