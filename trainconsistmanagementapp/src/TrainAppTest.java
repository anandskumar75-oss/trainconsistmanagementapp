import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
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
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Bogie bogie = (Bogie) obj;
        return capacity == bogie.capacity && name.equals(bogie.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + capacity;
    }
}

public class TrainAppTest {

    private List<Bogie> createBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 60));
        bogies.add(new Bogie("Pantry Car", 20));
        bogies.add(new Bogie("General", 50));
        return bogies;
    }

    @Test
    public void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> bogies = createBogies();
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        assertTrue(filtered.stream().allMatch(b -> b.capacity > 60));
        assertEquals(1, filtered.stream().filter(b -> b.name.equals("Sleeper")).count());
    }

    @Test
    public void testFilter_CapacityEqualToThreshold() {
        List<Bogie> bogies = createBogies();
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        assertFalse(filtered.stream().anyMatch(b -> b.capacity == 60));
    }

    @Test
    public void testFilter_NoBogiesMatching() {
        List<Bogie> bogies = createBogies();
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 100)
                .collect(Collectors.toList());
        assertTrue(filtered.isEmpty());
    }

    @Test
    public void testFilter_OriginalListUnchanged() {
        List<Bogie> bogies = createBogies();
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        assertEquals(5, bogies.size());  // Original list unchanged
    }
}