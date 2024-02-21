import commands.AddItemCommand;
import commands.Command;
import commands.RemoveItemCommand;
import order.Order;

import java.util.ArrayList;
import java.util.List;

class Waiter {
    private List<Command> commands;

    public Waiter() {
        this.commands = new ArrayList<>();
    }

    public void takeOrder(Command command) {
        commands.add(command);
    }

    public void placeOrders() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}

class FastFoodSimulation {

    public static void main(String[] args) {
        Order order = new Order();
        Waiter waiter = new Waiter();

        Command addItemCommand = new AddItemCommand(order, "Гамбургер");
        Command removeItemCommand = new RemoveItemCommand(order, "Картопля фрі");

        waiter.takeOrder(addItemCommand);
        waiter.takeOrder(removeItemCommand);

        waiter.placeOrders();

        order.display();
    }

}