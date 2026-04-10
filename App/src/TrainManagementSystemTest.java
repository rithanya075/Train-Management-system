import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TrainManagementSystemTest {

    @Test
    void testPerformanceExecution() {

        List<GoodsBogie> bogies = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        }

        long start = System.nanoTime();

        bogies.stream()
                .filter(b -> b.type.equals("Cylindrical"))
                .toList();

        long end = System.nanoTime();

        assertTrue((end - start) > 0); // just ensure it runs
    }
}