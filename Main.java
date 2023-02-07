import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to FITNESS DUKE");
        Scanner currentScanner = new Scanner(System.in);
        String name = new String();
        if (name.equals("")) {
            System.out.println("This seems like your first time logging in, may I have your name?");
            name = currentScanner.nextLine();
        }
        System.out.println("Welcome " + name + ", ready to start a workout?");
        System.out.println("Please type in any of the following commands:");
        System.out.println("Quick Workout : Quickly generates a recommended workout according to your needs");
        System.out.println("Focus Group : Exercise a particular muscle group");
        System.out.println("");
        boolean workoutChosen = false;
        while (!workoutChosen) {
            String typeOfWorkout = currentScanner.nextLine();
            switch (typeOfWorkout) {
                case "Quick Workout":
                    System.out.println("HABLAHABLAHABLA HERES A QUICK WORKOUT");
                    workoutChosen = true;
                    break;
                case "Focus Group":
                    System.out.println("HABLA FOCUS GROUP LALALA");
                    workoutChosen = true;
                    break;
                default:
                    System.out.println("Walao give an appropriate command leh");
            }
        }

        currentScanner.close();
    }
}
