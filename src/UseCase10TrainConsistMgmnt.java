import java.util.ArrayList;
import java.util.List;

/**
 * ==============================================================
 * MAIN CLASS - UseCase10TrainConsistMgmnt
 * ==============================================================
 * * Use Case 10: Count Total Seats in Train
 * * Description:
 * This class aggregates seating capacity of all bogies
 * into a single total using Stream reduce().
 * * At this stage, the application:
 * - Creates bogie list
 * - Maps bogies to capacity
 * - Reduces values into total
 * - Displays total seat count
 * * This maps aggregation logic using reduce().
 * * @author Developer
 * @version 10.0
 */
public class UseCase10TrainConsistMgmnt {

    // Reusing Bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + " seats)";
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("==========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println("- " + b);
        }

        // ---- AGGREGATE USING REDUCE ----
        // 1. mapToInt extracts the capacity field
        // 2. reduce(0, Integer::sum) adds them all up starting from 0
        int totalSeats = bogies.stream()
                .mapToInt(b -> b.capacity)
                .reduce(0, (sum, capacity) -> sum + capacity);

        System.out.println("\n------------------------------------------");
        System.out.println("Total Seating Capacity: " + totalSeats);
        System.out.println("------------------------------------------");
    }
}