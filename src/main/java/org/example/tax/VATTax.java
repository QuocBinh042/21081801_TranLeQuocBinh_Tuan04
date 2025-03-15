package org.example.tax;

public class VATTax implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.1; // 10%
    }
}