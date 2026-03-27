/**
 * ============================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * ============================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * This use case introduces collection initialization and
 * basic program startup flow.
 *
 * @author Developer
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("===========================================");
        System.out.println("   === Train Consist Management App ===   ");
        System.out.println("===========================================\n");

        // Create a dynamic List to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Print current state of the train
        System.out.println("\nCurrent Train Consist:");
        if (trainConsist.isEmpty()) {
            System.out.println("[ No bogies attached ]");
        } else {
            for (int i = 0; i < trainConsist.size(); i++) {
                System.out.println("Bogie " + (i + 1) + ": " + trainConsist.get(i));
            }
        }
    }
}
