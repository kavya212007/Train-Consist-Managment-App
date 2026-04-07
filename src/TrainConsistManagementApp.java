import java.util.Arrays;

/*
 * ============================================================
 * MAIN CLASS – UseCase18TrainConsistMgmt
 * ============================================================
 *
 * Use Case 18: Search Bogie Name Using Binary Search
 *
 * Description:
 * This class demonstrates searching for a bogie name
 * using Java’s built-in Arrays.binarySearch() method.
 *
 * At this stage, the application:
 * - Creates an array of bogie names
 * - Sorts the array using Arrays.sort()
 * - Searches for a specific bogie name
 * - Displays search result
 *
 * This maps efficient searching using Binary Search.
 *
 * @author Developer
 * @version 18.0
 */

public class UseCase18TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC18 - Search Bogie Name using Binary Search ");
        System.out.println("==================================================\n");

        // Create array of bogie names
        String[] bogieNames = {"Sleeper", "AC", "General", "ChairCar", "FirstClass"};

        // Sort array before binary search
        Arrays.sort(bogieNames);

        // Display sorted bogie names
        System.out.println("Sorted Bogie Names:");
        for (String name : bogieNames) {
            System.out.print(name + " ");
        }

        // Bogie name to search
        String searchName = "AC";

        // ----- BINARY SEARCH -----
        int result = Arrays.binarySearch(bogieNames, searchName);

        // Display result
        if (result >= 0) {
            System.out.println("\n\nBogie '" + searchName + "' found at index: " + result);
        } else {
            System.out.println("\n\nBogie '" + searchName + "' not found.");
        }
    }
}