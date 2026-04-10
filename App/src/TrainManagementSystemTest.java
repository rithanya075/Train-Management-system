import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainManagementSystemTest {

    @Test
    void testValidCapacity() {
        assertDoesNotThrow(() -> {
            PassengerBogie b = new PassengerBogie("Sleeper", 72);
        });
    }

    @Test
    void testInvalidCapacity() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("AC Chair", -5);
        });
    }
}