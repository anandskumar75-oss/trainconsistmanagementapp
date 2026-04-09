import java.util.HashMap;
import java.util.Map;

// =========================
// UC6 - Map Bogie to Capacity (HashMap)
// =========================
System.out.println("\n--- Bogie Capacity Mapping using HashMap ---");

// Create HashMap
Map<String, Integer> bogieCapacity = new HashMap<>();

// Add capacities for passenger bogies
bogieCapacity.put("Sleeper", 72);
bogieCapacity.put("AC Chair", 120);
bogieCapacity.put("First Class", 54);

// Iterate and display
System.out.println("Bogie Capacities:");
for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
        System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        System.out.println("\nUC6 completed successfully.");