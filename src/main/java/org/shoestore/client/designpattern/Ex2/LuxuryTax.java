package org.shoestore.client.designpattern.Ex2;

public class LuxuryTax implements Tax{
    @Override
    public double calculateTax(double price) {
        return 0.2 * price;
    }
}
