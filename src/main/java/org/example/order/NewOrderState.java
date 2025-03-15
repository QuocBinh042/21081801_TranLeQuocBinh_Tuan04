package org.example.order;

public class NewOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng: " + order.getOrderInfo());
        // Sau khi kiểm tra, chuyển sang trạng thái Đang xử lý với Strategy vận chuyển
        order.setState(new ProcessingOrderState(new StandardShipping()));
    }
}