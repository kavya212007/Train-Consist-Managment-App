import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ==============================================================
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 * ==============================================================
 * * Use Case 7: Sort Bogies by Capacity (Comparator)
 * * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 * * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a list
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted result
 * * This maps custom ordering using Comparator.
 * * @author Developer
 * @version 7.0
 */
public class UseCase7TrainConsistMgmnt {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String id;
        int capacity;

        Bogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return id + " (Seats: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("==========================================\n");

        List<Bogie> bogies = new ArrayList<>();

        // ---- CREATE bogie objects ----
        bogies.add(new Bogie("Sleeper-S1", 72));
        bogies.add(new Bogie("AC-3Tier-B1", 64));
        bogies.add(new Bogie("General-G1", 100));
        bogies.add(new Bogie("AC-2Tier-A1", 48));

        System.out.println("Unsorted Bogie List:");
        bogies.forEach(b -> System.out.println("- " + b));

        // ---- SORT using Comparator logic ----
        // Sorting in Ascending order of capacity
        Collections.sort(bogies, new Comparator<Bogie>() {
            @Override
            public int compare(Bogie b1, Bogie b2) {
                return Integer.compare(b1.capacity, b2.capacity);
            }
        });

        // ---- DISPLAY sorted result ----
        System.out.println("\nSorted Bogie List (by Capacity):");
        for (Bogie b : bogies) {
            System.out.println("- " + b);
        }

        // Quick check for the highest capacity
        Bogie max = Collections.max(bogies, Comparator.comparingInt(b -> b.capacity));
        System.out.println("\nBogie with highest capacity: " + max.id);
    }
}