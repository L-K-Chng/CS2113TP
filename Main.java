import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner currentSessionScanner = new Scanner(System.in);
        String name = currentSessionScanner.nextLine();
        System.out.println("Hello" + name);
        currentSessionScanner.close();
    }

}
