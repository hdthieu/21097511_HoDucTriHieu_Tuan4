package org.shoestore.client.designpattern.Ex3;

public class ProcessingFee extends PaymentDecorator{

    public ProcessingFee(Payment payment) {super(payment);}

    @Override
    public void pay(double amount){
        double finalAmount = amount + amount * 0.2;
        System.out.println("adding processing fee. New amount:  " + finalAmount);
        super.pay(finalAmount);
    }
}
