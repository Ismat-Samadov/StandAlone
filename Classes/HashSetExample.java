package Classes;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of integers
        Set<Integer> numbers = new HashSet<>();

        // Add elements to the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Checking if an element is present in the HashSet
        System.out.println("Is 30 present in the HashSet? " + numbers.contains(30));

        // Removing an element from the HashSet
        numbers.remove(40);
        System.out.println("HashSet after removing 40: " + numbers);

        // Iterating over the elements of the HashSet
        System.out.print("Elements of the HashSet: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
