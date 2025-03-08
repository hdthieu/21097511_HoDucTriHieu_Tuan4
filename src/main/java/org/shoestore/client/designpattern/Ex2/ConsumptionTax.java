package org.shoestore.client.designpattern.Ex2;

public class ConsumptionTax implements Tax{

    @Override
    public double calculateTax(double price) {
        return 0.05 * price;
    }
}
