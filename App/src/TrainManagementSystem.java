import java.util.*;

/**
 * UC14: Handle Invalid Bogie Capacity using Custom Exception
 */
public class TrainManagementSystem {

    public static void main(String[] args) {

        System.out.println("=== UC14: Bogie Capacity Validation ===");

        List<PassengerBogie> list = new ArrayList<>();

        try {
            // ✅ Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            list.add(b1);

            // ❌ Invalid bogie
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            list.add(b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}

/**
 * PassengerBogie Class with Validation
 */
class PassengerBogie {
    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0 for bogie: " + name);
        }
        this.name = name;
        this.capacity = capacity;
    }
}

/**
 * Custom Exception Class
 */
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}