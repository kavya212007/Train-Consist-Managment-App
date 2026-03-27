import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ==============================================================
 * MAIN CLASS - UseCase8TrainConsistMgmnt
 * ==============================================================
 * * Use Case 8: Filter Passenger Bogies Using Streams
 * * Description:
 * This class filters passenger bogies based on seating
 * capacity using Java Stream API.
 * * At this stage, the application:
 * - Creates a list of bogies
 * - Converts list into stream
 * - Applies filter condition
 * - Collects filtered result
 * - Displays qualifying bogies
 * * This maps functional filtering using Streams.
 * * @author Developer
 * @version 8.0
 */
public class UseCase8TrainConsistMgmnt {

    // Reusing Bogie model from UC7
    static class Bogie {
        String id;
        int capacity;

        Bogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return id + " (Capacity: " + capacity + ")";
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("==========================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper-S1", 72));
        bogies.add(new Bogie("AC-3Tier-B1", 64));
        bogies.add(new Bogie("General-G1", 100));
        bogies.add(new Bogie("AC-2Tier-A1", 48));
        bogies.add(new Bogie("General-G2", 100));

        System.out.println("Original Train List:");
        bogies.forEach(System.out::println);

        // ---- APPLY FILTER CONDITION ----
        // Goal: Find all bogies with a capacity greater than 70
        int threshold = 70;

        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.getCapacity() > threshold) // Filter logic
                .collect(Collectors.toList());            // Collect result

        // ---- DISPLAY QUALIFYING BOGIES ----
        System.out.println("\nFiltered List (Capacity > " + threshold + "):");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies found matching the criteria.");
        } else {
            highCapacityBogies.forEach(b -> System.out.println("- " + b));
        }

        // Additional Stream operation: Calculate Total Capacity
        int totalCapacity = bogies.stream()
                .mapToInt(Bogie::getCapacity)
                .sum();

        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);
    }
}