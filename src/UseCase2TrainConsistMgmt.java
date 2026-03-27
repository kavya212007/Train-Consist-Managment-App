/**
 * ============================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * ============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 *
 * This maps CRUD operations using ArrayList.
 *
 * @author Developer
 * @version 2.0
 */

import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   UC2 - Add Passenger Bogies to Train   ");
        System.out.println("===========================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        // add() attaches a new bogie to the train
        passengerBogies.add("S1");
        passengerBogies.add("S2");
        passengerBogies.add("S3");

        System.out.println("Bogies after addition: " + passengerBogies);

        // ---- READ (Check availability) ----
        String checkBogie = "S2";
        if (passengerBogies.contains(checkBogie)) {
            System.out.println("Bogie " + checkBogie + " is available.");
        } else {
            System.out.println("Bogie " + checkBogie + " is not available.");
        }

        // ---- UPDATE (Modify bogie) ----
        passengerBogies.set(1, "S2-Updated");
        System.out.println("Bogies after update: " + passengerBogies);

        // ---- DELETE (Remove bogie) ----
        passengerBogies.remove("S1");
        System.out.println("Bogies after removal: " + passengerBogies);

        // ---- FINAL CONSIST ----
        System.out.println("\nFinal Train Consist:");
        for (int i = 0; i < passengerBogies.size(); i++) {
            System.out.println("Bogie " + (i + 1) + ": " + passengerBogies.get(i));
        }
    }
}