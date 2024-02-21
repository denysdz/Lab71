package commands;

import order.Order;

public class RemoveItemCommand implements Command {
    private Order order;
    private String item;

    public RemoveItemCommand(Order order, String item) {
        this.order = order;
        this.item = item;
    }

    @Override
    public void execute() {
        order.removeItem(item);
    }
}
