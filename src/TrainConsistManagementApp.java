import java.util.Arrays;

/*
 * ============================================================
 * MAIN CLASS – UseCase17TrainConsistMgmt
 * ============================================================
 *
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * Description:
 * This class demonstrates sorting of bogie type names
 * alphabetically using Java’s built-in Arrays.sort() method.
 *
 * At this stage, the application:
 * - Creates an array of bogie names
 * - Uses Arrays.sort() for sorting
 * - Displays sorted results
 *
 * This maps optimized sorting using Java library utilities.
 *
 * @author Developer
 * @version 17.0
 */

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC17 - Sorting Bogie Names using Arrays.sort ");
        System.out.println("==============================================\n");

        // Create array of bogie names
        String[] bogieNames = {"Sleeper", "AC", "General", "ChairCar", "FirstClass"};

        // Display original order
        System.out.println("Original Bogie Names:");
        for (String name : bogieNames) {
            System.out.print(name + " ");
        }

        // ----- SORT USING ARRAYS.SORT -----
        Arrays.sort(bogieNames);

        // Display sorted result
        System.out.println("\n\nSorted Bogie Names (Alphabetical):");
        for (String name : bogieNames) {
            System.out.print(name + " ");
        }
    }
}