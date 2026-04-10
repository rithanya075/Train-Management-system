import java.util.*;

/**
 * UC18: Linear Search for Bogie ID
 */
public class TrainManagementSystem {

    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search for Bogie ID ===");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG202", "BG303", "BG404"};

        String searchKey = "BG303"; // 🔍 change this to test

        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND ✅");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND ❌");
        }
    }

    // 🔥 Linear Search Method
    public static boolean linearSearch(String[] arr, String key) {

        for (String id : arr) {
            if (id.equals(key)) {  // safe string comparison
                return true; // early termination
            }
        }
        return false;
    }
}