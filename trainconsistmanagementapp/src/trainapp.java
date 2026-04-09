import java.util.List;
import java.util.stream.Collectors;

// =========================
// UC8 - Filter Passenger Bogies Using Streams
// =========================
System.out.println("\n--- UC8: Filter Passenger Bogies with Capacity > 60 ---");

// Reuse the Bogie list from UC7 (passengerBogiesList)
List<Bogie> highCapacityBogies = passengerBogiesList.stream()
        .filter(b -> b.capacity > 60)  // condition: capacity > 60
        .collect(Collectors.toList());

// Display filtered bogies
System.out.println("Filtered Bogies (Capacity > 60):");
highCapacityBogies.forEach(System.out::println);

System.out.println("\nUC8 completed successfully.");git checkout -b uc8
git add .
git commit -m "UC8: Filter passenger bogies with capacity > 60 using Stream API"
