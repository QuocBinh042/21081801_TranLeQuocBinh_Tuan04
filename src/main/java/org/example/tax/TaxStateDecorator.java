package org.example.tax;

public abstract class TaxStateDecorator implements TaxState {
    protected TaxState wrappedState;

    public TaxStateDecorator(TaxState state) {
        this.wrappedState = state;
    }

    @Override
    public double applyTax(Product product) {
        return wrappedState.applyTax(product);
    }
}