import java.util.ArrayList;

public class Player {
    String name = "No name";
    Double Money = -1.0;

    ArrayList<Item> inventory = new ArrayList<Item>();

    public void player(String name) {
        this.name = name;
        Money = 10000.0;
    }

    public void printInventoryItems() {
        for (Item item : inventory) {
            item.printItemName();
        }
    }

}
