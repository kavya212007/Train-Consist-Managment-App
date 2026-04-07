/**
 * ======================================================================
 * MAIN CLASS - UseCase15TrainConsistMgmnt
 * ======================================================================
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 * * Description:
 * This class safely assigns cargo to goods bogies
 * while handling unsafe combinations using structured
 * exception handling blocks.
 * * At this stage, the application:
 * - Defines a custom runtime exception
 * - Validates cargo assignment rules
 * - Throws exception for unsafe cargo
 * - Catches and handles the exception
 * - Executes finally block for logging
 * * @author Developer
 * @version 15.0
 */

public class UseCase15TrainConsistMgmnt {

    // ---- CUSTOM RUNTIME EXCEPTION ----
    // Extends RuntimeException so it doesn't require mandatory 'throws' clauses
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie model
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        /**
         * Assigns cargo with safety validation logic.
         * Demonstrates the use of try-catch-finally for critical business rules.
         */
        void assignCargo(String cargo) {
            try {
                System.out.println(">>> Initializing assignment: " + cargo + " to " + shape + " bogie.");

                // Safety Rule: Rectangular bogies are structurally unfit for liquid petroleum
                if (this.shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("CRITICAL SAFETY ERROR: Rectangular bogie cannot carry Petroleum!");
                }

                this.cargo = cargo;
                System.out.println("STATUS: Cargo '" + cargo + "' successfully secured.");

            } catch (CargoSafetyException e) {
                // Handling the specific safety violation
                System.err.println("ALERT: " + e.getMessage());
                System.err.println("ACTION: Assignment blocked to prevent potential derailment.");
            } finally {
                // The finally block is essential for audit trails in railway software
                System.out.println("AUDIT LOG: Operation finalized for Bogie Shape [" + this.shape + "]");
                System.out.println("----------------------------------------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("TRAIN CONSIST MANAGEMENT SYSTEM - UC15 START\n");

        // Scenario A: Valid Assignment
        GoodsBogie bogieA = new GoodsBogie("Rectangular");
        bogieA.assignCargo("Coal");

        // Scenario B: Invalid Assignment (Petroleum in Rectangular)
        GoodsBogie bogieB = new GoodsBogie("Rectangular");
        bogieB.assignCargo("Petroleum");

        // Scenario C: Valid Assignment (Assuming Petroleum is fine for other shapes like 'Tanker')
        GoodsBogie bogieC = new GoodsBogie("Tanker");
        bogieC.assignCargo("Petroleum");
    }
}