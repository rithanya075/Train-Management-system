import java.util.*;

/**
 * UC12: Safety Compliance Check for Goods Bogies
 */
public class TrainManagementSystem {

    public static void main(String[] args) {

        System.out.println("=== Train Safety Compliance Check ===");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));

        boolean safe = isSafe(bogies);

        if (safe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }

    // 🔥 Core Logic (UC12)
    public static boolean isSafe(List<GoodsBogie> list) {
        return list.stream().allMatch(b ->
                !(b.type.equals("Cylindrical") && !b.cargo.equals("Petroleum"))
        );
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