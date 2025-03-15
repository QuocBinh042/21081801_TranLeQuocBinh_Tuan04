package org.example.payment;

public class DiscountDecorator extends PaymentDecorator {
    private double discount;

    public DiscountDecorator(PaymentStrategy strategy, double discount) {
        super(strategy);
        this.discount = discount;
    }

    @Override
    public void pay(double amount) {
        double total = amount - discount;
        System.out.println("Mã giảm giá: " + discount + ", tổng tiền sau giảm: " + total);
        wrappedStrategy.pay(total);
    }
}
