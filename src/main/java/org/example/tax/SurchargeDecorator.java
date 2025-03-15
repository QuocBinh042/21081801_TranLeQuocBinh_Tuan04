package org.example.tax;

public class SurchargeDecorator extends TaxStateDecorator {
    private double surcharge;

    public SurchargeDecorator(TaxState state, double surcharge) {
        super(state);
        this.surcharge = surcharge;
    }

    @Override
    public double applyTax(Product product) {
        double baseTax = wrappedState.applyTax(product);
        double totalTax = baseTax + surcharge;
        System.out.println("Áp dụng surcharge: " + surcharge + ", tổng thuế: " + totalTax);
        return totalTax;
    }
}