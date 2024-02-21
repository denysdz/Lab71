package order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println("Додано: " + item);
    }

    public void removeItem(String item) {
        items.remove(item);
        System.out.println("Видалено: " + item);
    }

    public void display() {
        System.out.println("Замовлення:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}