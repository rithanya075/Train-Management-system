import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class TrainManagementSystemTest {

    @Test
    public void testSafeTrain() {
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Box", "Coal"));

        assertTrue(TrainManagementSystem.isSafe(list));
    }

    @Test
    public void testUnsafeTrain() {
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Water"));

        assertFalse(TrainManagementSystem.isSafe(list));
    }
}