package org.shoestore.client.designpattern.Ex1;

class ShippedState implements OrderState {
    @Override
    public void next(OrderContext context) {
        context.setState(new DeliveredState());
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(new ProcessingState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order has been shipped.");
    }
}
