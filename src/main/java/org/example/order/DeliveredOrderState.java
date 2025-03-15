package org.example.order;

public class DeliveredOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
        // Quá trình hoàn tất
    }
}