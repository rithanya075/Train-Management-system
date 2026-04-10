import java.util.*;
import java.util.stream.Collectors;

/**
 * UC9: Group Bogies by Type using Streams
 */

// 🔹 Bogie Class
class Bogie {
    String name;
    int capacity;
    String type; // NEW FIELD

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

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

        // 🔹 Create Bogie List
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 60, "Passenger"));
        bogies.add(new Bogie("First Class", 40, "Passenger"));
        bogies.add(new Bogie("Cargo", 100, "Goods"));
        bogies.add(new Bogie("Parcel", 80, "Goods"));

        // 🔹 Group by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // 🔹 Display grouped result
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        System.out.println("\nSystem Ready for Next Operations...");
    }
}