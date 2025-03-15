package org.example.tax;

public class TaxCalculationTest {
    public static void main(String[] args) {
        Product product = new Product("Sản phẩm A", 1000);

        product.setTaxState(new CalculatedState(new VATTax()));
        double vatTax = product.calculateTax();

        product.setTaxState(new SurchargeDecorator(new CalculatedState(new LuxuryTax()), 50));
        double luxuryTaxWithSurcharge = product.calculateTax();
    }
}
