import java.util.*;

/**
 * UC16: Bubble Sort for Passenger Bogie Capacities
 */
public class TrainManagementSystem {

    public static void main(String[] args) {

        System.out.println("=== UC16: Bubble Sort for Bogie Capacities ===");

        int[] capacities = {72, 50, 100, 30, 60};

        System.out.println("Before Sorting:");
        printArray(capacities);

        bubbleSort(capacities);

        System.out.println("After Sorting:");
        printArray(capacities);
    }

    // 🔥 Bubble Sort Logic
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}