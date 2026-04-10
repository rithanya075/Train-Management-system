import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainManagementSystemTest {

    @Test
    void testSafeCargo() {
        GoodsBogie b = new GoodsBogie("Rectangular", "Coal");

        assertDoesNotThrow(() -> {
            TrainManagementSystem.assignCargo(b);
        });
    }

    @Test
    void testUnsafeCargo() {
        GoodsBogie b = new GoodsBogie("Rectangular", "Petroleum");

        // Since exception is caught internally, we just ensure method runs
        assertDoesNotThrow(() -> {
            TrainManagementSystem.assignCargo(b);
        });
    }
}