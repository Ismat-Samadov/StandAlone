package Classes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Durian");

        System.out.println("Queue: " + queue);

        // Removing an element from the queue
        String removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        // Peeking at the first element in the queue
        String firstElement = queue.peek();
        System.out.println("First Element: " + firstElement);

        // Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue Empty? " + isEmpty);

        // Getting the size of the queue
        int size = queue.size();
        System.out.println("Queue Size: " + size);
    }
}
