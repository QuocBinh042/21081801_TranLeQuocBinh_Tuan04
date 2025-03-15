package org.example.tax;

public class LuxuryTax implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.2; // 20%
    }
}