import java.util.LinkedList;

/**
 * UC4: Maintain Ordered Train Consist using LinkedList
 */

public class TrainManagementSystem {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================");

        // 🔹 Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // 🔹 Add bogies (Initial)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // 🔹 Insert Pantry Car at position 2
        train.add(2, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car at position 2:");
        System.out.println(train);

        // 🔹 Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);

        // 🔹 Final Output
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(train);

        System.out.println("\nSystem Ready for Next Operations...");
    }
}