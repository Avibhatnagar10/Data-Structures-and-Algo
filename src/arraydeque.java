import java.util.ArrayDeque;
import java.util.Deque;

public class arraydeque {
    public static void main(String[] args) {
        // Create an ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements to the end of the deque
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);

        // Add elements to the front of the deque
        deque.addFirst(0);
        deque.addFirst(-1);

        // Print the deque
        System.out.println("Deque after additions: " + deque);

        // Remove elements from the front of the deque
        deque.removeFirst();
        deque.removeFirst();

        // Remove elements from the end of the deque
        deque.removeLast();

        // Print the deque
        System.out.println("Deque after removals: " + deque);

        // Peek at the first and last elements
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());
    }
}
