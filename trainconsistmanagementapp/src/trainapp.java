import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

public class TrainApp {
    public static void main(String[] args) {
        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 60));
        bogies.add(new Bogie("Pantry Car", 20));
        bogies.add(new Bogie("General", 50));

        // Filter bogies with capacity > 60 using Stream API
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("Filtered Bogies with capacity > 60:");
        filteredBogies.forEach(System.out::println);

        // The original list remains unchanged
        System.out.println("\nOriginal Bogies List:");
        bogies.forEach(System.out::println);
    }
}