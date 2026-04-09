import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// =========================
// UC7 - Sort Bogies by Capacity (Comparator)
// =========================

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

// In main method or UC7 section
System.out.println("\n--- UC7: Sort Passenger Bogies by Capacity ---");

        // Create List of Bogies
        List<Bogie> passengerBogiesList = new ArrayList<>();

// Add bogies
passengerBogiesList.add(new Bogie("Sleeper", 72));
        passengerBogiesList.add(new Bogie("AC Chair", 120));
        passengerBogiesList.add(new Bogie("First Class", 54));

// Sort by capacity ascending
        passengerBogiesList.sort(Comparator.comparingInt(b -> b.capacity));

// Display sorted bogies
        System.out.println("Passenger Bogies sorted by capacity:");
for (Bogie b : passengerBogiesList) {
        System.out.println(b);
}

        System.out.println("\nUC7 completed successfully.");