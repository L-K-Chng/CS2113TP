import java.util.ArrayList;

import java.util.ArrayList;

public class Shop {
    ArrayList<Item> itemList = new ArrayList<Item>();

    public Item createItem(String name, Double price) {
        Item thisItem = new Item();
        thisItem.item(name, price);
        return thisItem;
    }

    public void shop() {
        itemList.add(createItem("Candy", 2.0));
        itemList.add(createItem("Sword", 90.0));
        itemList.add(createItem("5.0 CAP", 9000.0));
    }

    public void buyItem(Player player, int itemIndex) {
        if (player.Money >= itemList.get(itemIndex).price) {
            player.Money -= itemList.get(itemIndex).price;
        } else {
            System.out.println("Not enough money");
        }
    }

    public void printItemList() {
        int index = 0;
        for (Item item : itemList) {
            System.out.println(index + ": " + item.name + "Item price is " + item.price);
            index += 1;
        }
    }
}
