import java.util.ArrayList;
import java.util.List;

/**
 * =======================================================
 * MAIN CLASS - UseCase12TrainConsistMgmnt
 * =======================================================
 * Use Case 12: Safety Compliance Check for Goods Bogies
 */
public class UseCase12TrainConsistMgmnt {

    // Goods Bogie model
    static class GoodsBogie {
        String bogieId;
        double weightTons;
        boolean brakeSystemFunctional;

        GoodsBogie(String bogieId, double weightTons, boolean brakeSystemFunctional) {
            this.bogieId = bogieId;
            this.weightTons = weightTons;
            this.brakeSystemFunctional = brakeSystemFunctional;
        }
    }

    public static void main(String[] args) {
        // 1. Creates goods bogie list
        List<GoodsBogie> bogieList = new ArrayList<>();
        bogieList.add(new GoodsBogie("BG-001", 45.5, true));
        bogieList.add(new GoodsBogie("BG-002", 48.2, true));
        bogieList.add(new GoodsBogie("BG-003", 42.0, true));
        // bogieList.add(new GoodsBogie("BG-004", 55.0, false)); // Example of a failure case

        // 2 & 3. Converts list into stream and applies safety validation rule
        // Safety Rule: Weight must be <= 50 tons AND brakes must be functional
        boolean isAllSafe = bogieList.stream()
                .allMatch(bogie -> bogie.weightTons <= 50.0 && bogie.brakeSystemFunctional);

        // 4. Displays safety status
        System.out.println("--- Train Safety Compliance Report ---");
        if (isAllSafe) {
            System.out.println("STATUS: COMPLIANT");
            System.out.println("All bogies passed the safety inspection.");
        } else {
            System.out.println("STATUS: NON-COMPLIANT");
            System.out.println("Warning: One or more bogies failed the safety check!");
        }
    }
}