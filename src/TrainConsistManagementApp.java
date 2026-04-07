/**
 * ======================================================================
 * MAIN CLASS - UseCase20TrainConsistMgmnt
 * ======================================================================
 * * Use Case 20: Exception Handling During Search Operations
 * * Description:
 * This class prevents searching when no bogies exist
 * by applying fail-fast validation using exceptions.
 * * At this stage, the application:
 * - Creates bogie collection
 * - Validates system state
 * - Throws exception if empty
 * - Stops invalid search operation
 * - Displays meaningful message
 * * This maps defensive programming using runtime exceptions.
 * * @author Developer
 * @version 20.0
 */
public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {

        // Create bogie array (empty train scenario)
        String[] bogieIds = {};

        // Search key
        String searchId = "BG101";

        try {
            // ---- FAIL-FAST VALIDATION ----
            // Check if train has bogies before performing search
            if (bogieIds.length == 0) {
                throw new IllegalStateException("SYSTEM ERROR: Cannot perform search on an empty train consist.");
            }

            // ---- SEARCH LOGIC (executes only if data exists) ----
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equalsIgnoreCase(searchId)) {
                    found = true;
                    break;
                }
            }

            // Display result
            if (found) {
                System.out.println("SUCCESS: Bogie " + searchId + " found in the consist.");
            } else {
                System.out.println("NOT FOUND: Bogie " + searchId + " is not part of this train.");
            }

        } catch (IllegalStateException e) {
            // Capturing the fail-fast exception
            System.err.println("VALIDATION FAILED: " + e.getMessage());
            System.err.println("REASON: Search operation aborted to prevent Null or Empty pointer logic.");
        }

        System.out.println("\nUC20 execution completed...");
    }
}