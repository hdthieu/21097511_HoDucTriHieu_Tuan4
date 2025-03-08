package org.shoestore.client.designpattern.Ex2;

public class VATTax implements Tax{
    @Override
    public double calculateTax(double price) {
        return 0.1 * price;
    }
}
