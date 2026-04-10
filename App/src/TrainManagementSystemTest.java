import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainManagementSystemTest {

    @Test
    void testFound() {
        String[] arr = {"BG101", "BG202", "BG303", "BG404"};

        assertTrue(TrainManagementSystem.binarySearch(arr, "BG202"));
    }

    @Test
    void testNotFound() {
        String[] arr = {"BG101", "BG202", "BG303", "BG404"};

        assertFalse(TrainManagementSystem.binarySearch(arr, "BG999"));
    }
}