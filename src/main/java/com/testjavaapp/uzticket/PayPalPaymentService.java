package com.testjavaapp.uzticket;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYMENT SYSTEM PAYPAL");
        System.out.printf("Amount: %s \n", amount);
    }
}
