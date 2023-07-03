package Classes;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> names = new LinkedList<>();

        // Add elements to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Accessing elements in the LinkedList
        System.out.println("Element at index 2: " + names.get(2));

        // Updating an element in the LinkedList
        names.set(1, "Ben");
        System.out.println("Updated element at index 1: " + names.get(1));

        // Removing an element from the LinkedList
        names.remove(3);
        System.out.println("LinkedList after removing element at index 3: " + names);

        // Iterating over the elements of the LinkedList
        System.out.print("Elements of the LinkedList: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
