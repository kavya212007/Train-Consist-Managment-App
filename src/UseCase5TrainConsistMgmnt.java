import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ==============================================================
 * MAIN CLASS - UseCase5TrainConsistMgmnt
 * ==============================================================
 * * Use Case 5: Preserve Insertion Order of Bogies
 * * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 * * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 * * This maps ordered uniqueness using LinkedHashSet.
 * * @author Developer
 * @version 5.0
 */
public class UseCase5TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==========================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- ATTACHING BOGIES (In Sequence) ----
        formation.add("Engine_01");
        formation.add("Passenger_A1");
        formation.add("Passenger_B1");
        formation.add("Pantry_P1");
        formation.add("Passenger_S1");

        // ---- ATTEMPT DUPLICATE ATTACHMENT ----
        // The system should ignore these to prevent ID conflicts
        System.out.println("Action: Attempting to re-attach Engine_01 and Passenger_A1...");
        formation.add("Engine_01");
        formation.add("Passenger_A1");

        // ---- DISPLAY FINAL FORMATION ----
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        int position = 1;
        for (String unit : formation) {
            System.out.println("Position " + position + ": " + unit);
            position++;
        }

        // Verification of properties
        System.out.println("\nTotal Unique Units: " + formation.size());
        System.out.println("Order Preserved: " + (formation.toArray()[0].equals("Engine_01")));
    }
}