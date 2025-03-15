package org.example.tax;

public class NotCalculatedState implements TaxState {
    @Override
    public double applyTax(Product product) {
        System.out.println("Thuế chưa được tính cho sản phẩm: " + product.getName());
        return 0;
    }
}