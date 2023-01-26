import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner currentSessionScanner = new Scanner(System.in);
        String name = currentSessionScanner.nextLine();
        System.out.println("Hello" + name + ", welcome to some game i guess");
        Player player = new Player();
        player.player(name);

        System.out.println("Here is a shop, here are the items");
        Shop thisShop = new Shop();
        thisShop.shop();
        thisShop.printItemList();

        while (true) {
            System.out.println("Would you like to buy something?");
            int input = currentSessionScanner.nextInt();
            if (input == -1) {
                break;
            }
            thisShop.buyItem(player, input);
        }

        currentSessionScanner.close();
    }
}
