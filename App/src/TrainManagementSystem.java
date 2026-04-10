import java.util.*;
import java.util.stream.Collectors;

/**
 * UC10: Count Total Seats using Stream reduce()
 */

// 🔹 Bogie Class
class Bogie {
    String name;
    int capacity;
    String type;

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

        // 🔹 Calculate total seating capacity
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)              // extract capacity
                .reduce(0, Integer::sum);          // sum all values

        // 🔹 Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nSystem Ready for Next Operations...");
    }
}