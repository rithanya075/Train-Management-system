import java.util.Arrays;

/**
 * UC19: Binary Search for Bogie ID
 */
public class TrainManagementSystem {

    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search for Bogie ID ===");

        // 🔥 MUST BE SORTED
        String[] bogieIds = {"BG101", "BG202", "BG303", "BG404", "BG505"};

        String searchKey = "BG303";

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND ✅");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND ❌");
        }
    }

    // 🔥 Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = arr[mid].compareTo(key);

            if (result == 0) {
                return true; // found
            } else if (result < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }
}