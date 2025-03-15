package org.example.payment;

public class PaymentCompletedState implements PaymentState {
    @Override
    public void process(Payment payment) {
        System.out.println("Thanh toán đã hoàn tất.");
    }
}