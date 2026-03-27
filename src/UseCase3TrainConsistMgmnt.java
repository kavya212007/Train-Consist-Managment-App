import java.util.HashSet;
import java.util.Set;

/**
 * ==============================================================
 * MAIN CLASS - UseCase3TrainConsistMgmnt
 * ==============================================================
 * * Use Case 3: Track Unique Bogie IDs
 * * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 * * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 * * This maps uniqueness validation using Set.
 * * @author Developer
 * @version 3.0
 */
public class UseCase3TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("==========================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        // add() inserts bogie IDs into the set
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries will be ignored internally by HashSet
        System.out.println("Attempting to add duplicate IDs: BG101 and BG102...");
        bogies.add("BG101"); // Duplicate entry
        bogies.add("BG102"); // Duplicate entry

        // ---- DISPLAY UNIQUE BOGIES ----
        System.out.println("\nList of Unique Bogies in System:");
        System.out.println(bogies);

        // Checking the size to prove duplicates were rejected
        System.out.println("\nTotal Unique Bogies Count: " + bogies.size());

        // Quick validation check
        if (bogies.contains("BG103")) {
            System.out.println("Validation: Bogie BG103 is verified in the system.");
        }
    }
}