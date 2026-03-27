import java.util.HashMap;
import java.util.Map;

/**
 * ==============================================================
 * MAIN CLASS - UseCase6TrainConsistMgmnt
 * ==============================================================
 * * Use Case 6: Map Bogie to Capacity (HashMap)
 * * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 * * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 * * This maps lookup-based access using HashMap.
 * * @author Developer
 * @version 6.0
 */
public class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==========================================\n");

        // HashMap stores data in key -> value format
        // Key: Bogie Name (String), Value: Capacity (Integer)
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- INSERT bogie capacities ----
        capacityMap.put("General - G1", 100);
        capacityMap.put("Sleeper - S1", 72);
        capacityMap.put("AC 3-Tier - B1", 64);
        capacityMap.put("AC 2-Tier - A1", 48);
        capacityMap.put("Pantry Car", 0);

        // ---- READ / LOOKUP ----
        String checkBogie = "Sleeper - S1";
        System.out.println("Capacity of " + checkBogie + " is: " + capacityMap.get(checkBogie) + " seats.");

        // ---- ITERATE through map entries ----
        System.out.println("\nFull Train Capacity Breakdown:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        // ---- UPDATE capacity ----
        // Updating G1 capacity for a special holiday run
        capacityMap.put("General - G1", 120);
        System.out.println("\nUpdated G1 Capacity: " + capacityMap.get("General - G1"));

        // Final size check
        System.out.println("\nTotal unique bogie types mapped: " + capacityMap.size());
    }
}
