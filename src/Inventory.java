import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    // Lägger till item
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " has been added to your inventory.");
    }

    // Tar bort item
    public void removeItem(Item item) {
        if (items.remove(item)) {
            System.out.println(item.getName() + " has been removed from your inventory.");
        } else {
            System.out.println(item.getName() + " is not in your inventory.");
        }
    }

    // Visa alla av dina Items i ditt inventory
    public void displayItems() {
        System.out.println("\nYour Inventory:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + ": " + item.getDescription());
        }
    }

    
}
