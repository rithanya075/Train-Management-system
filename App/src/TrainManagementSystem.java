import java.util.*;

/**
 * UC7: Sort Bogies by Capacity using Comparator
 */

// 🔹 Bogie Class (Custom Object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for printing
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainManagementSystem {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================");

        // 🔹 Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // 🔹 Add Bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // 🔹 Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 🔹 Display Sorted List
        System.out.println("\nBogies Sorted by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSystem Ready for Next Operations...");
    }
}