package org.shoestore.client.designpattern.Ex3;

public class CreditCardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using CreditCard");
    }

}
