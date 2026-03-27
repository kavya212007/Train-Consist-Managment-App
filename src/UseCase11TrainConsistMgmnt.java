import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * =======================================================
 * MAIN CLASS - UseCase11TrainConsistMgmnt
 * =======================================================
 * Use Case 11: Validate Train ID and Cargo Code
 * * Description:
 * This class validates input formats using Regular Expressions.
 */
public class UseCase11TrainConsistMgmnt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Define Regex Patterns (Adjust these based on your specific requirements)
        // Example Train ID: 3 letters followed by 4 digits (e.g., TRN1234)
        String trainIdRegex = "^[A-Z]{3}\\d{4}$";

        // Example Cargo Code: 2 digits, a dash, and 3 uppercase letters (e.g., 10-OIL)
        String cargoCodeRegex = "^\\d{2}-[A-Z]{3}$";

        System.out.println("--- Train Consist Management Validation ---");

        // 2. Accept Train ID Input
        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        // 3. Accept Cargo Code Input
        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // 4. Apply Regex Validation & Display Results
        System.out.println("\n--- Validation Results ---");

        validateInput("Train ID", trainId, trainIdRegex);
        validateInput("Cargo Code", cargoCode, cargoCodeRegex);

        scanner.close();
    }

    /**
     * Helper method to validate input against a regex and print the result.
     */
    private static void validateInput(String fieldName, String input, String regex) {
        if (Pattern.matches(regex, input)) {
            System.out.println(fieldName + " [" + input + "]: VALID");
        } else {
            System.out.println(fieldName + " [" + input + "]: INVALID (Format mismatch)");
        }
    }
}