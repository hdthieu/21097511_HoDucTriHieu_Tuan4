package org.shoestore.client.designpattern.Ex1;

public interface OrderState {
    void next(OrderContext context);
    void prev(OrderContext context);
    void printStatus();
}
