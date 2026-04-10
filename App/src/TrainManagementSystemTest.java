import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainManagementSystemTest {

    @Test
    void testFound() {
        String[] arr = {"BG101", "BG202", "BG303"};

        assertTrue(TrainManagementSystem.linearSearch(arr, "BG202"));
    }

    @Test
    void testNotFound() {
        String[] arr = {"BG101", "BG202", "BG303"};

        assertFalse(TrainManagementSystem.linearSearch(arr, "BG999"));
    }
}