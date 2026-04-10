import java.util.Arrays;

/**
 * UC17: Sort Bogie Names using Arrays.sort()
 */
public class TrainManagementSystem {

    public static void main(String[] args) {

        System.out.println("=== UC17: Sort Bogie Names Alphabetically ===");

        // Input array
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogies));

        // 🔥 Inbuilt sorting
        Arrays.sort(bogies);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogies));
    }
}