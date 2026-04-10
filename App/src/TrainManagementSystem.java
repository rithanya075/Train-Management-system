import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs using HashSet
 */

public class TrainManagementSystem {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================");

        // 🔹 Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // 🔹 Add bogie IDs
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");

        // 🔹 Attempt duplicate insert
        bogieIds.add("B102"); // Duplicate → ignored

        // 🔹 Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // 🔹 Check if ID exists
        System.out.println("\nDoes B101 exist? " + bogieIds.contains("B101"));

        // 🔹 Continue program
        System.out.println("\nSystem Ready for Next Operations...");
    }
}