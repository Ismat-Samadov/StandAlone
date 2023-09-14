package Classes;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the front of the deque
        deque.addFirst("Apple");
        deque.addFirst("Banana");
        deque.addFirst("Cherry");

        // Adding elements to the end of the deque
        deque.addLast("Durian");
        deque.addLast("Elderberry");

        System.out.println("Deque: " + deque);

        // Removing an element from the front of the deque
        String removedFirstElement = deque.removeFirst();
        System.out.println("Removed First Element: " + removedFirstElement);
        System.out.println("Deque after removal from front: " + deque);

        // Removing an element from the end of the deque
        String removedLastElement = deque.removeLast();
        System.out.println("Removed Last Element: " + removedLastElement);
        System.out.println("Deque after removal from end: " + deque);

        // Peeking at the first element in the deque
        String firstElement = deque.peekFirst();
        System.out.println("First Element: " + firstElement);

        // Peeking at the last element in the deque
        String lastElement = deque.peekLast();
        System.out.println("Last Element: " + lastElement);
    }
}
