package Classes;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Accessing elements in the ArrayList
        System.out.println("Element at index 2: " + numbers.get(2));

        // Updating an element in the ArrayList
        numbers.set(1, 25);
        System.out.println("Updated element at index 1: " + numbers.get(1));

        // Removing an element from the ArrayList
        numbers.remove(3);
        System.out.println("ArrayList after removing element at index 3: " + numbers);

        // Iterating over the elements of the ArrayList
        System.out.print("Elements of the ArrayList: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
