import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        // UC1
        System.out.println("=== Train Consist Management App ===");
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // =========================
        // UC2 - Passenger Bogies
        // =========================
        System.out.println("\n--- Adding Passenger Bogies ---");

        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("After removal: " + passengerBogies);

        System.out.println("Is Sleeper present? " + passengerBogies.contains("Sleeper"));

        // =========================
        // UC3 - Unique Bogie IDs
        // =========================
        System.out.println("\n--- Tracking Unique Bogie IDs ---");

        // Create HashSet
        Set<String> bogieIds = new HashSet<>();

        // Add IDs (with duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display final set
        System.out.println("Unique Bogie IDs: " + bogieIds);

        System.out.println("\nUC3 completed successfully.");
    }
}