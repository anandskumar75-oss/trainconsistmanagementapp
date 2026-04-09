import java.util.LinkedHashSet;
import java.util.Set;

// =========================
// UC5 - Preserve Order + Uniqueness (LinkedHashSet)
// =========================
System.out.println("\n--- Train Formation using LinkedHashSet ---");

// Create LinkedHashSet
Set<String> trainFormation = new LinkedHashSet<>();

// Add bogies
trainFormation.add("Engine");
trainFormation.add("Sleeper");
trainFormation.add("Cargo");
trainFormation.add("Guard");

// Add duplicate intentionally
trainFormation.add("Sleeper"); // duplicate (will be ignored)

// Display formation
System.out.println("Final Train Formation: " + trainFormation);

System.out.println("\nUC5 completed successfully.");