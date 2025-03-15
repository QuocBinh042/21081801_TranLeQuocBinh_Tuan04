package org.example.payment;

public class Payment {
    private PaymentState state;
    private PaymentStrategy strategy;
    private double amount;

    public Payment(double amount, PaymentStrategy strategy) {
        this.amount = amount;
        this.strategy = strategy;
        this.state = new PaymentInitiatedState();
    }

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void processPayment() {
        state.process(this);
        // Sau khi xử lý trạng thái, thực hiện thanh toán theo strategy
        strategy.pay(amount);
    }
}
