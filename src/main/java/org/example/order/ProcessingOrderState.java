package org.example.order;

public class ProcessingOrderState implements OrderState {
    private ShippingStrategy shippingStrategy;

    public ProcessingOrderState(ShippingStrategy strategy) {
        this.shippingStrategy = strategy;
    }

    @Override
    public void handleOrder(Order order) {
        System.out.println("Đóng gói đơn hàng.");
        shippingStrategy.ship(order);
        // Sau khi xử lý, chuyển sang trạng thái Đã giao
        order.setState(new DeliveredOrderState());
    }
}
