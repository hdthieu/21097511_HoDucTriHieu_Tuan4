package org.shoestore.client.designpattern.Ex1;


public class OrderContext {
    private OrderState state;

    public OrderContext() {
        // Khởi tạo đơn hàng ở trạng thái "Processing"
        state = new ProcessingState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void prevState() {
        state.prev(this);
    }

    public void printStatus() {
        state.printStatus();
    }

}
