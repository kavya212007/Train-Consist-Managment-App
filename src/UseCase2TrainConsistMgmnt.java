import java.util.ArrayList;
import java.util.List;

/**
 * ==============================================================
 * MAIN CLASS - UseCase2TrainConsistMgmnt
 * ==============================================================
 * * Use Case 2: Add Passenger Bogies to Train
 * * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 * * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 * * This maps CRUD operations using ArrayList.
 * * @author Developer
 * @version 2.0
 */
public class UseCase2TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==========================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        // add() attaches a new bogie to the train
        passengerBogies.add("General - G1");
        passengerBogies.add("Sleeper - S1");
        passengerBogies.add("Sleeper - S2");
        passengerBogies.add("AC 3-Tier - B1");
        passengerBogies.add("AC 2-Tier - A1");

        System.out.println("Initial Train Consist: " + passengerBogies);

        // ---- READ (Check availability) ----
        boolean hasAC = passengerBogies.contains("AC 3-Tier - B1");
        System.out.println("Is AC 3-Tier available? " + hasAC);

        // ---- UPDATE (Replace a bogie if needed) ----
        // Replacing G1 with a newer model
        passengerBogies.set(0, "General - G1 (New)");

        // ---- DELETE (Remove a bogie) ----
        // Removing Sleeper S2 for maintenance
        passengerBogies.remove("Sleeper - S2");
        System.out.println("Updated Train Consist after removal: " + passengerBogies);

        // ---- DISPLAY FINAL CONSIST ----
        System.out.println("\nFinal Train Consist Report:");
        for (String bogie : passengerBogies) {
            System.out.println("- " + bogie);
        }

        System.out.println("\nTotal Bogies: " + passengerBogies.size());
    }
}