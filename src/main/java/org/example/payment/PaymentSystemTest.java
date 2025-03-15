package org.example.payment;

public class PaymentSystemTest {
    public static void main(String[] args) {
        // Sử dụng CreditCardPayment với phí xử lý và mã giảm giá
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy withFee = new ProcessingFeeDecorator(creditCard, 5.0);
        PaymentStrategy withFeeAndDiscount = new DiscountDecorator(withFee, 3.0);

        Payment payment = new Payment(100, withFeeAndDiscount);
        payment.processPayment();
    }
}