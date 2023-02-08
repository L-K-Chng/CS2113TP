import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FitnessLogos {
    //Data Storage
    private static final ArrayList<String> listOfExercises = new ArrayList<>();

    //Core
    static final String SIT_UPS = "Sit Ups";
    static final String PLANK = "Plank";
    static final String SIDE_PLANK = "Side Plank";
    static final String CRUNCHES = "Crunches";

    //Arms
    static final String PUSH_UPS = "Push Ups";
    static final String WIDE_PUSHUPS = "Wide Push Ups";
    static final String PLANK_SHOULDER_TAPS = "Plank Shoulder Taps";
    static final String PULL_UPS = "Pull Ups";
    static final String DIAMOND_PUSHUPS = "Diamond Push Ups";

    //Legs
    static final String SQUATS = "Squats";
    static final String FORWARD_LUNGES = "Forward Lunges";
    static final String REAR_LUNGES = "Rear Lunges";
    static final String JUMPING_JACKS = "Jumping Jacks";
    static final String PISTOL_SQUATS = "Pistol Squats";
    static final String HIGH_KNEES = "High Knees";

    //Everything
    static final String BURPEES = "Burpees";
    static final String MOUNTAIN_CLIMBERS = "Mountain Climbers";

    public static void quickWorkout() {
        List<String> exerciseList = Arrays.asList(SQUATS, WIDE_PUSHUPS,CRUNCHES, BURPEES, HIGH_KNEES, PLANK_SHOULDER_TAPS, SIDE_PLANK, MOUNTAIN_CLIMBERS);
        listOfExercises.addAll(exerciseList);

        String instructions = "Do this set of exercises for a quick pump! " +
                "Make sure to stick to a Work-Rest Cycle of 60S-30S for best results!";
        System.out.println(instructions);

        for (int i = 0; i < listOfExercises.size(); i++) {
            System.out.println(i+1 + ". " + listOfExercises.get(i));
        }
        listOfExercises.clear();
    }

    public static void focusGroupArms() {
        List<String> exerciseList = Arrays.asList(PUSH_UPS,PLANK_SHOULDER_TAPS, WIDE_PUSHUPS, PULL_UPS, DIAMOND_PUSHUPS);
        listOfExercises.addAll(exerciseList);

        String instructions = "Try this set of exercises for a killer arm workout! " +
                "Make sure to stick to a Work-Rest Cycle of 60S-30S for best results!";
        System.out.println(instructions);

        for (int i = 0; i < listOfExercises.size(); i++) {
            System.out.println(i+1 + ". " + listOfExercises.get(i));
        }
        listOfExercises.clear();
    }

    public static void focusGroupLegs() {
        List<String> exerciseList = Arrays.asList(SQUATS, FORWARD_LUNGES, JUMPING_JACKS, PISTOL_SQUATS, REAR_LUNGES);
        listOfExercises.addAll(exerciseList);

        String instructions = "Try this set of exercises for a killer leg workout! " +
                "Make sure to stick to a Work-Rest Cycle of 60S-30S for best results!";
        System.out.println(instructions);

        for (int i = 0; i < listOfExercises.size(); i++) {
            System.out.println(i+1 + ". " + listOfExercises.get(i));
        }
        listOfExercises.clear();
    }

    public static void focusGroupCore() {
        List<String> exerciseList = Arrays.asList(SIT_UPS, BURPEES, CRUNCHES, PLANK, SIDE_PLANK);
        listOfExercises.addAll(exerciseList);

        String instructions = "Try this set of exercises for a killer core workout! " +
                "Make sure to stick to a Work-Rest Cycle of 60S-30S for best results!";
        System.out.println(instructions);

        for (int i = 0; i < listOfExercises.size(); i++) {
            System.out.println(i+1 + ". " + listOfExercises.get(i));
        }
        listOfExercises.clear();
    }
}
