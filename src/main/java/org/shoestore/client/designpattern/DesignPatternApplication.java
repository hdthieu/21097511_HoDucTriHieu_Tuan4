package org.shoestore.client.designpattern;

import org.shoestore.client.designpattern.Ex2.Product;
import org.shoestore.client.designpattern.Ex2.TaxAll;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);

                    // Ex1

        //        OrderContext order = new OrderContext();
//        order.printStatus();
//        order.nextState();
//        order.printStatus();
//        order.prevState();
//        order.printStatus();


                    // Ex2
        Product phone = new Product("Smartphone", 1000, new TaxAll(false));
        phone.displayPrice();

        Product luxuryWatch = new Product("Luxury Watch", 5000, new TaxAll(true));
        luxuryWatch.displayPrice();



    }

}
