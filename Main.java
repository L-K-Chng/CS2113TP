import java.util.Scanner;

public class Main {

    //Commands
    static final String COMMAND_QUICK_WORKOUT = "Quick Workout";
    static final String COMMAND_FOCUS_GROUP = "Focus Group";
    static final String COMMAND_END = "End";
    static final String COMMAND_ARMS = "Arms";
    static final String COMMAND_LEGS = "Legs";
    static final String COMMAND_CORE = "Core";

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
        System.out.println("End : Done for the day and want to exit this program (Highly not recommended)");
        boolean workoutChosen = false;

        while (!workoutChosen) {
            String typeOfWorkout = currentScanner.nextLine();
            switch (typeOfWorkout) {
            case COMMAND_QUICK_WORKOUT:
                System.out.println("HABLAHABLAHABLA HERES A QUICK WORKOUT");
                FitnessLogos.quickWorkout();
                break;
            case COMMAND_FOCUS_GROUP:
                System.out.println("Which particular muscle group would you like to work on? (You can choose from either Arms, Legs or Core)");
                String input;
                input = currentScanner.nextLine();
                if (input.equals(COMMAND_ARMS)) {
                    FitnessLogos.focusGroupArms();
                } else if (input.equals(COMMAND_LEGS)) {
                    FitnessLogos.focusGroupLegs();
                } else if (input.equals(COMMAND_CORE)) {
                    FitnessLogos.focusGroupCore();
                } else {
                    System.out.println("Please key in a valid muscle group! (Arms/Legs/Core)");
                }
                break;
            case COMMAND_END:
                System.out.println("Hope you had a great workout today, goodbye!");
                workoutChosen = true;
                break;
            default:
                System.out.println("Please give an appropriate command! (Quick Workout/Focus Group/End)");
            }
        }
        currentScanner.close();
    }
}
