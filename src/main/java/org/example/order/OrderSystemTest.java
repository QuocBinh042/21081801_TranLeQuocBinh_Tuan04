package org.example.order;

public class OrderSystemTest {
    public static void main(String[] args) {
        Order order = new Order("Đơn hàng số 123");

        order.setState(new NewOrderState());

        order.processOrder();
        order.processOrder();
        order.processOrder();
    }
}