import java.util.Arrays;

/*
 * ============================================================
 * MAIN CLASS – UseCase19TrainConsistMgmt
 * ============================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using the Binary Search algorithm on sorted data.
 *
 * At this stage, the application:
 * - Creates sorted bogie ID array
 * - Defines search key
 * - Applies binary search logic
 * - Narrows search range each iteration
 * - Displays result
 *
 * This maps optimized searching logic using divide-and-conquer.
 *
 * @author Developer
 * @version 19.0
 */

public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("==================================================\n");

        // Create sorted array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG300", "BG412", "BG550"};

        // Ensure data is sorted before binary search (precondition)
        Arrays.sort(bogieIds);

        // Search key
        String key = "BG300";

        // Display available bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // ----- BINARY SEARCH LOGIC -----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                System.out.println("\n\nBogie ID '" + key + "' found at index: " + mid);
                found = true;
                break;
            }
            else if (comparison < 0) {
                low = mid + 1;   // Search right half
            }
            else {
                high = mid - 1;  // Search left half
            }
        }

        if (!found) {
            System.out.println("\n\nBogie ID '" + key + "' not found.");
        }
    }
}