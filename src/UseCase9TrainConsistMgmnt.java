import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ==============================================================
 * MAIN CLASS - UseCase9TrainConsistMgmnt
 * ==============================================================
 * * Use Case 9: Group Bogies by Type
 * * Description:
 * This class groups similar bogies together using
 * Java Stream Collectors.groupingBy().
 * * At this stage, the application:
 * - Creates a list of bogies
 * - Streams the list
 * - Groups bogies by name
 * - Stores grouped data in a Map
 * - Displays grouped structure
 * * This maps classification logic using groupingBy.
 * * @author Developer
 * @version 9.0
 */
public class UseCase9TrainConsistMgmnt {

    // Reusing Bogie model from UC7 / UC8
    static class Bogie {
        String type; // e.g., "General", "Sleeper", "AC"
        String id;

        Bogie(String type, String id) {
            this.type = type;
            this.id = id;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return id;
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("==========================================\n");

        List<Bogie> trainBogies = new ArrayList<>();

        // ---- CREATE a list of bogies ----
        trainBogies.add(new Bogie("General", "G1"));
        trainBogies.add(new Bogie("Sleeper", "S1"));
        trainBogies.add(new Bogie("AC", "B1"));
        trainBogies.add(new Bogie("General", "G2"));
        trainBogies.add(new Bogie("Sleeper", "S2"));
        trainBogies.add(new Bogie("AC", "B2"));
        trainBogies.add(new Bogie("General", "G3"));

        // ---- GROUP bogies by name (type) ----
        // Collectors.groupingBy creates a Map<String, List<Bogie>>
        Map<String, List<Bogie>> groupedBogies = trainBogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // ---- DISPLAY grouped structure ----
        System.out.println("Train Bogies Grouped by Classification:");
        groupedBogies.forEach((type, list) -> {
            System.out.println("Type: " + type + " | Bogies: " + list);
        });

        // Summary count per group
        System.out.println("\nSummary Count:");
        groupedBogies.forEach((type, list) -> {
            System.out.println("- " + type + ": " + list.size() + " coach(es)");
        });
    }
}