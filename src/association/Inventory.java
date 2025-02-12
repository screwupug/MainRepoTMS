package association;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void showInventory() {
        System.out.println("Инвертарь " + items);
    }
}
