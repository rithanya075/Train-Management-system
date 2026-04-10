import java.util.LinkedHashSet;

/**
 * UC5: Maintain insertion order with uniqueness using LinkedHashSet
 */

public class TrainManagementSystem {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================");

        // 🔹 Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // 🔹 Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // 🔹 Try duplicate
        train.add("Sleeper"); // ignored

        // 🔹 Display formation
        System.out.println("\nTrain Formation (Ordered & Unique):");
        System.out.println(train);

        System.out.println("\nSystem Ready for Next Operations...");
    }
}