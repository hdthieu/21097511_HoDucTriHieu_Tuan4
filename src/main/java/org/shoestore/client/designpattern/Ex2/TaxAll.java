package org.shoestore.client.designpattern.Ex2;

public class TaxAll implements  Tax{
    private boolean isLuxury;

    public TaxAll(boolean isLuxury) {
        this.isLuxury = isLuxury;
    }

    @Override
    public double calculateTax(double price)
    {
        double tax = price * 0.1;
        tax += price * 0.05;
        if(isLuxury){
            tax += price * 0.15;
        }
        return  tax;
    }
}
