import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TrainManagementSystemTest {

    @Test
    void testExceptionThrown() {
        List<String> list = new ArrayList<>();

        assertThrows(IllegalStateException.class, () -> {
            TrainManagementSystem.safeSearch(list, "BG101");
        });
    }

    @Test
    void testValidSearch() {
        List<String> list = new ArrayList<>();
        list.add("BG101");
        list.add("BG202");

        assertTrue(TrainManagementSystem.safeSearch(list, "BG202"));
    }
}