package Classes;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        Map<Integer, String> students = new HashMap<>();

        // Add key-value pairs to the HashMap
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(4, "David");
        students.put(5, "Eve");

        // Accessing values in the HashMap
        System.out.println("Value for key 3: " + students.get(3));

        // Updating a value in the HashMap
        students.put(2, "Ben");
        System.out.println("Updated value for key 2: " + students.get(2));

        // Removing a key-value pair from the HashMap
        students.remove(4);
        System.out.println("HashMap after removing key 4: " + students);

        // Iterating over the key-value pairs in the HashMap
        System.out.println("Key-value pairs in the HashMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

