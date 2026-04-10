import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class TrainManagementSystemTest {

    @Test
    void testSorting() {
        String[] bogies = {"Sleeper", "AC Chair", "Cargo"};

        Arrays.sort(bogies);

        assertArrayEquals(
                new String[]{"AC Chair", "Cargo", "Sleeper"},
                bogies
        );
    }

    @Test
    void testAlreadySorted() {
        String[] bogies = {"AC", "Cargo", "Sleeper"};

        Arrays.sort(bogies);

        assertArrayEquals(
                new String[]{"AC", "Cargo", "Sleeper"},
                bogies
        );
    }
}