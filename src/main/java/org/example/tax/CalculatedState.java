package org.example.tax;

public class CalculatedState implements TaxState {
    private TaxStrategy taxStrategy;

    public CalculatedState(TaxStrategy strategy) {
        this.taxStrategy = strategy;
    }

    @Override
    public double applyTax(Product product) {
        double tax = taxStrategy.calculateTax(product.getPrice());
        System.out.println("Thuế cho sản phẩm " + product.getName() + " là: " + tax);
        return tax;
    }
}