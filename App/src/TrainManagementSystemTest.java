import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainManagementSystemTest {

    @Test
    void testBubbleSort() {
        int[] arr = {72, 50, 100, 30};

        TrainManagementSystem.bubbleSort(arr);

        assertArrayEquals(new int[]{30, 50, 72, 100}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {10, 20, 30};

        TrainManagementSystem.bubbleSort(arr);

        assertArrayEquals(new int[]{10, 20, 30}, arr);
    }
}