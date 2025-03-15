package org.example.payment;

public class ProcessingFeeDecorator extends PaymentDecorator {
    private double fee;

    public ProcessingFeeDecorator(PaymentStrategy strategy, double fee) {
        super(strategy);
        this.fee = fee;
    }

    @Override
    public void pay(double amount) {
        double total = amount + fee;
        System.out.println("Phí xử lý: " + fee + ", tổng tiền: " + total);
        wrappedStrategy.pay(total);
    }
}