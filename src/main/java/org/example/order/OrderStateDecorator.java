package org.example.order;

public abstract class OrderStateDecorator implements OrderState {
    protected OrderState wrappedState;

    public OrderStateDecorator(OrderState state) {
        this.wrappedState = state;
    }

    @Override
    public void handleOrder(Order order) {
        wrappedState.handleOrder(order);
    }
}

