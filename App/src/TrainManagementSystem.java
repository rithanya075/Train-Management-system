import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Train Consist Initialization
 * Train Management System Entry Point
 */

public class TrainManagementSystem {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================");

        // 🔹 Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // 🔹 Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // 🔹 Continue execution
        System.out.println("System Ready for Operations...");
    }
}