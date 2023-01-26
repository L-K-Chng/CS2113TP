import java.util.Scanner;

public class Main {

    // Booleans for Phases
    static Boolean shopping = true;
    static Boolean waiting = false;

    public static void main(String[] args) {
        Scanner currentSessionScanner = new Scanner(System.in);
        String name = currentSessionScanner.nextLine();
        System.out.println("Hello " + name + ", welcome to some game i guess");
        Player player = new Player();
        player.player(name);

        System.out.println("Here is a shop, here are the items");
        Shop thisShop = new Shop();
        thisShop.shop();
        thisShop.printItemList();
        while (shopping) {
            System.out.println("Would you like to buy something? (Type Y for yes and N for no)");
            String input = currentSessionScanner.nextLine();
            switch (input) {
                case "Y":
                    System.out.println("Please type in the index of the item you wish to buy (in between " + 0 + " and "
                            + (thisShop.itemList.size() - 1) + ")");
                    int itemIndexToBuy = currentSessionScanner.nextInt();
                    thisShop.buyItem(player, itemIndexToBuy);
                    // This consumes the next dummy line, such that it doesnt print the default case
                    // automatically
                    String dummy = currentSessionScanner.nextLine();
                    break;
                case "N":
                    System.out.println("Have a nice day");
                    shopping = false;
                    break;
                default:
                    System.out.println("INPUT IS :" + input);
                    System.out.println("Please type in either Y or N please");
                    break;
            }
            waiting = true;
            /*
             * if (input.equals("Y")) {
             * System.out.
             * println("Please type in the index of the item you wish to buy (in between " +
             * 0 + " and "
             * + (thisShop.itemList.size() - 1) + ")");
             * int itemIndexToBuy = currentSessionScanner.nextInt();
             * thisShop.buyItem(player, itemIndexToBuy);
             * } else if (input.equals("N")) {
             * } else {
             * System.out.println("INPUT IS :" + input);
             * System.out.println("Please type in either Y or N please");
             * }
             */
        }

        System.out.println("Now we are in the \"what do i do now\" phase");
        System.out.println(
                "You can go and fight monsters (type: FIGHT), check your inventory (type: INVENTORY), or hug your mom (type: HUG), or exit the game (type: EXIT) ");

        while (waiting) {
            String action = currentSessionScanner.nextLine();
            if (action.equals("FIGHT")) {
                System.out.println("You went to fight a monster");
            } else if (action.equals("INVENTORY")) {
                player.printInventoryItems();
            } else if (action.equals("HUG")) {
                System.out.println("You went to hug a tree. Thats weird, your mom is not a tree.");
            } else if (action.equals("EXIT")) {
                System.out.println("Bye traveller");
                break;
            }

        }
        currentSessionScanner.close();
    }
}
