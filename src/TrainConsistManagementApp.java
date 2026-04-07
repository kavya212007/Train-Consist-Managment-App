import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
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
 */
public class TrainConsistManagementApp {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return String.format("Bogie: %-15s | Capacity: %d seats", name, capacity);
        }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("==============================================\n");

        // 1. Create a List of Bogie objects
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("AC Chair Car", 56));
        bogieList.add(new Bogie("General", 90));

        // 2. Display Unsorted Data
        System.out.println("Unsorted Bogie List:");
        bogieList.forEach(System.out::println);
        System.out.println();

        // 3. Sort using Comparator logic (Ascending by Capacity)
        // Using Lambda expression for concise comparison
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // 4. Display Sorted Result (Ascending)
        System.out.println("Sorted Bogie List (Ascending Capacity):");
        bogieList.forEach(System.out::println);
        System.out.println();

        // 5. Bonus: Sort using Comparator logic (Descending by Capacity)
        System.out.println("Sorted Bogie List (Descending Capacity):");
        bogieList.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());
        bogieList.forEach(System.out::println);


        System.out.println("\n----------------------------------------------");
        System.out.println("Sorting complete. Optimal usage planning enabled.");
    }
}