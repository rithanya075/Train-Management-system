import java.util.*;

/**
 * UC20: Exception Handling During Search Operations
 */
public class TrainManagementSystem {

    public static void main(String[] args) {

        System.out.println("=== UC20: Safe Search with Exception Handling ===");

        List<String> bogieList = new ArrayList<>();

        // 🔍 Try searching in empty list
        try {
            boolean result = safeSearch(bogieList, "BG101");
            System.out.println("Found: " + result);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Add data and try again
        bogieList.add("BG101");
        bogieList.add("BG202");

        try {
            boolean result = safeSearch(bogieList, "BG202");
            System.out.println("Search Result: " + result);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 🔥 Safe Search Method
    public static boolean safeSearch(List<String> list, String key) {

        // ❗ Defensive check
        if (list.isEmpty()) {
            throw new IllegalStateException("Cannot search: No bogies available in the train.");
        }

        // Linear search
        for (String id : list) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}