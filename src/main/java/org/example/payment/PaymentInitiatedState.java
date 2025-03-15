package org.example.payment;

public class PaymentInitiatedState implements PaymentState {
    @Override
    public void process(Payment payment) {
        System.out.println("Thanh toán được khởi tạo.");
        payment.setState(new PaymentProcessingState());
    }
}
