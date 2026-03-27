import java.util.LinkedList;
import java.util.List;

/**
 * ==============================================================
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 * ==============================================================
 * * Use Case 4: Maintain Ordered Bogie Consist
 * * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 * * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 * * This maps positional operations using LinkedList.
 * * @author Developer
 * @version 4.0
 */
public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==========================================\n");

        // Create a LinkedList
        // LinkedList maintains insertion order and allows fast inserts
        LinkedList<String> trainConsist = new LinkedList<>();

        // ---- ADDING BOGIES (Sequential) ----
        trainConsist.add("Engine");
        trainConsist.add("Bogie 1");
        trainConsist.add("Bogie 2");

        // ---- POSITIONAL OPERATIONS ----
        // addFirst() attaches to the very front
        trainConsist.addFirst("Guard Van (Front)");

        // addLast() attaches to the very end
        trainConsist.addLast("Guard Van (Rear)");

        System.out.println("Initial Train Structure: " + trainConsist);

        // ---- INSERT AT SPECIFIC POSITION ----
        // Inserting a Pantry Car at index 2
        trainConsist.add(2, "Pantry Car");

        // ---- REMOVAL OPERATIONS ----
        // Removing from front and rear (standard for trains during shunting)
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // ---- DISPLAY UPDATED STRUCTURE ----
        System.out.println("\nUpdated Train Structure after Shunting:");
        for (int i = 0; i < trainConsist.size(); i++) {
            System.out.println("Position " + i + ": " + trainConsist.get(i));
        }

        System.out.println("\nFinal Train Size: " + trainConsist.size() + " units.");
    }
}