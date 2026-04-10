import java.util.*;
import java.util.stream.Collectors;

/**
 * UC13: Performance Comparison (Loops vs Streams)
 */
public class TrainManagementSystem {

    public static void main(String[] args) {

        System.out.println("=== UC13: Loop vs Stream Performance ===");

        List<GoodsBogie> bogies = new ArrayList<>();

        // 🔹 Create sample data
        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0)
                bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
            else
                bogies.add(new GoodsBogie("Box", "Coal"));
        }

        // 🔥 LOOP BASED FILTERING
        long startLoop = System.nanoTime();

        List<GoodsBogie> loopResult = new ArrayList<>();
        for (GoodsBogie b : bogies) {
            if (b.type.equals("Cylindrical")) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🔥 STREAM BASED FILTERING
        long startStream = System.nanoTime();

        List<GoodsBogie> streamResult = bogies.stream()
                .filter(b -> b.type.equals("Cylindrical"))
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ✅ OUTPUT
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");
    }
}

/**
 * GoodsBogie Class
 */
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}