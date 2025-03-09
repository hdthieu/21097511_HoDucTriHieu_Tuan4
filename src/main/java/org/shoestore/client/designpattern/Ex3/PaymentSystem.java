package org.shoestore.client.designpattern.Ex3;

public class PaymentSystem {
    public static void main(String[] args) {
        System.out.println("Credit Card");
        Payment creditCard = new CreditCardPayment();
        creditCard.pay(100);


        System.out.println("Paypal Payment with processing fee");
        Payment paypalWithFee = new ProcessingFee(new PayPalPayment());
        paypalWithFee.pay(200);
    }
}
