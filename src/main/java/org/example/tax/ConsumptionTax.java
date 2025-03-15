package org.example.tax;

public class ConsumptionTax implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.05; // 5%
    }
}
