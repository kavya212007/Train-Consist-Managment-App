/**
 * =======================================================
 * MAIN CLASS - UseCase14TrainConsistMgmnt
 * =======================================================
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 */
public class UseCase14TrainConsistMgmnt {

    // 1. Defines a custom exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // 2. Passenger Bogie model with validation
    static class PassengerBogie {
        String bogieId;
        int seatingCapacity;

        // Constructor validates capacity inside
        PassengerBogie(String bogieId, int seatingCapacity) throws InvalidCapacityException {
            // 3. Throws exception if capacity <= 0
            if (seatingCapacity <= 0) {
                throw new InvalidCapacityException("Invalid Capacity: " + seatingCapacity
                        + ". Seating must be greater than 0.");
            }
            this.bogieId = bogieId;
            this.seatingCapacity = seatingCapacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Passenger Bogie Creation Log ---");

        // 4. Prevents invalid bogie creation and 5. Continues execution safely
        try {
            System.out.println("Attempting to create valid Bogie...");
            PassengerBogie bogie1 = new PassengerBogie("PB-101", 50);
            System.out.println("Successfully created Bogie: " + bogie1.bogieId);

            System.out.println("\nAttempting to create invalid Bogie...");
            PassengerBogie bogie2 = new PassengerBogie("PB-102", -5); // This will trigger exception
            System.out.println("This line will not be printed.");

        } catch (InvalidCapacityException e) {
            // Displays error safely without crashing the program
            System.err.println("CRITICAL ERROR: " + e.getMessage());
        }

        System.out.println("\nApplication execution continues safely...");
    }
}
