import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // UC1 - Initialization
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // =========================
        // UC2 - Passenger Bogies
        // =========================

        System.out.println("\n--- Adding Passenger Bogies ---");

        // Create passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Remove one bogie (AC Chair)
        System.out.println("\nRemoving AC Chair...");
        passengerBogies.remove("AC Chair");

        // Check if Sleeper exists
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Is Sleeper present? " + exists);

        // Final list
        System.out.println("\nFinal Passenger Bogies: " + passengerBogies);

        System.out.println("\nUC2 completed successfully.");
    }
}