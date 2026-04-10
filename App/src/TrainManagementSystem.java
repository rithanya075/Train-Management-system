import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Dynamic Bogie Management using ArrayList
 */

public class TrainManagementSystem {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================");

        // 🔹 Create ArrayList for bogies
        List<String> bogies = new ArrayList<>();

        // 🔹 Add bogies (CREATE)
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // 🔹 Display bogies (READ)
        System.out.println("\nBogie List After Addition:");
        System.out.println(bogies);

        // 🔹 Remove a bogie (DELETE)
        bogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(bogies);

        // 🔹 Check existence (SEARCH)
        boolean exists = bogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper exist? " + exists);

        // 🔹 Final state
        System.out.println("\nFinal Bogie List:");
        System.out.println(bogies);

        // 🔹 Continue program
        System.out.println("\nSystem Ready for Next Operations...");
    }
}