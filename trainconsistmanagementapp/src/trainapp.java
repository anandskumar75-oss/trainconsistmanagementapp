import java.util.LinkedList;

// =========================
// UC4 - Ordered Train Consist (LinkedList)
// =========================
System.out.println("\n--- Maintaining Ordered Train Consist ---");

// Create LinkedList
LinkedList<String> trainOrder = new LinkedList<>();

// Add bogies
trainOrder.add("Engine");
trainOrder.add("Sleeper");
trainOrder.add("AC");
trainOrder.add("Cargo");
trainOrder.add("Guard");

System.out.println("Initial Train Order: " + trainOrder);

// Insert Pantry Car at position 2 (index starts from 0)
trainOrder.add(2, "Pantry Car");

System.out.println("After adding Pantry Car: " + trainOrder);

// Remove first and last bogie
trainOrder.removeFirst();
trainOrder.removeLast();

System.out.println("Final Train Order: " + trainOrder);

System.out.println("\nUC4 completed successfully.");