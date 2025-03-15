package org.example.order;

public class Order {
    private OrderState state;
    private String orderInfo;

    public Order(String info) {
        this.orderInfo = info;
        // Khởi tạo ban đầu là trạng thái "Mới tạo"
        this.state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.handleOrder(this);
    }

    public String getOrderInfo() {
        return orderInfo;
    }
}
