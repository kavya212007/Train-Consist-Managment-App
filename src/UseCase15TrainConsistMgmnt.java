/**
 * ======================================================================
 * MAIN CLASS - UseCase15TrainConsistMgmnt
 * ======================================================================
 * * Use Case 15: Safe Cargo Assignment Using try-catch-finally
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
 * * This maps runtime safety handling using try-catch-finally.
 * * @author Developer
 * @version 15.0
 */

public class UseCase15TrainConsistMgmnt {

    // ---- CUSTOM RUNTIME EXCEPTION ----
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

        // Assign cargo with safety validation
        void assignCargo(String cargo) {
            try {
                System.out.println("Validating assignment: " + cargo + " to " + shape + " bogie...");

                // Rule: Rectangular bogie cannot carry petroleum
                if (this.shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("SAFETY VIOLATION: Rectangular bogies are unsafe for liquid petroleum!");
                }

                this.cargo = cargo;
                System.out.println("SUCCESS: Cargo '" + cargo + "' assigned safely.");

            } catch (CargoSafetyException e) {
                System.err.println("HANDLED EXCEPTION: " + e.getMessage());
            } finally {
                System.out.println("AUDIT: Assignment attempt finalized for Bogie Shape: " + this.shape);
                System.out.println("------------------------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        // Test Case 1: Safe Assignment
        GoodsBogie bogie1 = new GoodsBogie("Rectangular");
        bogie1.assignCargo("Coal");

        // Test Case 2: Unsafe Assignment (Triggers Exception)
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");
    }
}