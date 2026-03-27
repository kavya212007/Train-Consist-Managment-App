import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =======================================================
 * MAIN CLASS - UseCase13TrainConsistMgmnt
 * =======================================================
 * Use Case 13: Performance Comparison (Loops vs Streams)
 */
public class UseCase13TrainConsistMgmnt {

    static class Bogie {
        int id;
        boolean isHeavyDuty;

        Bogie(int id, boolean isHeavyDuty) {
            this.id = id;
            this.isHeavyDuty = isHeavyDuty;
        }
    }

    public static void main(String[] args) {
        // 1. Creates bogie test dataset (100,000 items for measurable timing)
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            bogies.add(new Bogie(i, i % 2 == 0));
        }

        // 2. Measures loop execution time
        long startTimeLoop = System.nanoTime();
        List<Bogie> filteredLoop = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.isHeavyDuty) {
                filteredLoop.add(b);
            }
        }
        long endTimeLoop = System.nanoTime();
        long durationLoop = endTimeLoop - startTimeLoop;

        // 3. Measures stream execution time
        long startTimeStream = System.nanoTime();
        List<Bogie> filteredStream = bogies.stream()
                .filter(b -> b.isHeavyDuty)
                .collect(Collectors.toList());
        long endTimeStream = System.nanoTime();
        long durationStream = endTimeStream - startTimeStream;

        // 4 & 5. Calculates and Displays performance results
        System.out.println("--- Performance Benchmarking Results ---");
        System.out.println("Dataset Size: " + bogies.size() + " bogies");
        System.out.println("Loop Duration   : " + durationLoop + " ns");
        System.out.println("Stream Duration : " + durationStream + " ns");

        String winner = (durationLoop < durationStream) ? "Loop" : "Stream";
        System.out.println("\nFaster Method: " + winner);
    }
}