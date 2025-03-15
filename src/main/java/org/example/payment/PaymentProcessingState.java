package org.example.payment;

public class PaymentProcessingState implements PaymentState {
    @Override
    public void process(Payment payment) {
        System.out.println("Đang xử lý thanh toán.");
        payment.setState(new PaymentCompletedState());
    }
}
