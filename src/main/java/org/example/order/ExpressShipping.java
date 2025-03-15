package org.example.order;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public void ship(Order order) {
        System.out.println("Vận chuyển bằng dịch vụ nhanh.");
    }
}