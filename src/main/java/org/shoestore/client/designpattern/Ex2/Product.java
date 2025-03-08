package org.shoestore.client.designpattern.Ex2;

public class Product {
    private String name;
    private double price;
    private Tax tax;

    public Product(String name, double price, Tax tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public double calculatePrice() {
        return price + tax.calculateTax(price);
    }

    public void displayPrice() {
        System.out.println("Product: " + name + " Price: " + calculatePrice() );
    }
}
