package org.shoestore.client.designpattern;

import org.shoestore.client.designpattern.Ex1.OrderContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
        OrderContext order = new OrderContext();
        order.printStatus();
        order.nextState();
        order.printStatus();
        order.prevState();
        order.printStatus();
    }

}
