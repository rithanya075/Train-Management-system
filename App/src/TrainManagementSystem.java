import java.util.*;

/**
 * UC15: Safe Cargo Assignment using try-catch-finally
 */
public class TrainManagementSystem {

    public static void main(String[] args) {

        System.out.println("=== UC15: Cargo Safety Assignment ===");

        GoodsBogie b1 = new GoodsBogie("Rectangular", "Coal");
        GoodsBogie b2 = new GoodsBogie("Rectangular", "Petroleum"); // ❌ unsafe

        assignCargo(b1);
        assignCargo(b2);

        System.out.println("Program continues safely...");
    }

    // 🔥 Cargo Assignment Logic
    public static void assignCargo(GoodsBogie bogie) {
        try {
            // ❌ Rule: Petroleum not allowed in Rectangular bogie
            if (bogie.type.equals("Rectangular") && bogie.cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe Cargo! Petroleum cannot be assigned to Rectangular bogie.");
            }

            System.out.println("Cargo assigned successfully to " + bogie.type + " bogie.");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.\n");
        }
    }
}

/**
 * GoodsBogie Class
 */
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

/**
 * Custom Runtime Exception
 */
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}