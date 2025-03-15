package org.example.tax;

public class Product {
    private String name;
    private double price;
    private TaxState taxState;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.taxState = new NotCalculatedState();
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setTaxState(TaxState state) {
        this.taxState = state;
    }

    public double calculateTax() {
        return taxState.applyTax(this);
    }
}