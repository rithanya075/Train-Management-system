import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UC11: Validate Train ID & Cargo Code using Regex
 */

public class TrainManagementSystem {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================");

        // 🔹 Sample Inputs (you can later replace with Scanner)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // 🔹 Define Regex Patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // 🔹 Compile Patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // 🔹 Create Matchers
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // 🔹 Validate
        boolean isTrainValid = m1.matches();
        boolean isCargoValid = m2.matches();

        // 🔹 Output Results
        System.out.println("\nTrain ID: " + trainId + " → " +
                (isTrainValid ? "Valid ✅" : "Invalid ❌"));

        System.out.println("Cargo Code: " + cargoCode + " → " +
                (isCargoValid ? "Valid ✅" : "Invalid ❌"));

        System.out.println("\nSystem Ready for Next Operations...");
    }
}