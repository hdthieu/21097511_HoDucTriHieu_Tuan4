package org.shoestore.client.designpattern.Ex1;

public class DeliveredState implements OrderState{
    @Override
    public void next(OrderContext context) {
        System.out.println("This order is already delivered.");
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(new ShippedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order has been delivered.");
    }
}
