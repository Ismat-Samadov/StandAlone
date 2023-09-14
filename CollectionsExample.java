import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionsExample {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // LinkedList example
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.remove(1);
        System.out.println("\nLinkedList:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // HashSet example
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("\nHashSet:");
        for (String color : colors) {
            System.out.println(color);
        }

        // HashMap example
        HashMap<String, String> countryCodes = new HashMap<>();
        countryCodes.put("US", "United States");
        countryCodes.put("IN", "India");
        countryCodes.put("GB", "United Kingdom");
        System.out.println("\nHashMap:");
        for (String key : countryCodes.keySet()) {
            System.out.println(key + ": " + countryCodes.get(key));
        }
    }
}
