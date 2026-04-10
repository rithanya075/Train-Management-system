import java.util.HashMap;
import java.util.Map;

/**
 * UC6: Map Bogie to Capacity using HashMap
 */

public class TrainManagementSystem {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================");

        // 🔹 Create HashMap (Bogie → Capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // 🔹 Insert values
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // 🔹 Display mapping
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 🔹 Example lookup
        System.out.println("\nCapacity of Sleeper: " + bogieCapacity.get("Sleeper"));

        System.out.println("\nSystem Ready for Next Operations...");
    }
}