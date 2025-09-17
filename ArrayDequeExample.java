import java.util.ArrayDeque; 
public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of integers
        ArrayDeque<Integer> deque = new java.util.ArrayDeque<>();

        // Add elements to the ArrayDeque
        deque.add(10);
        deque.add(20);
        deque.add(30);

        // Print the ArrayDeque
        System.out.println("ArrayDeque elements: " + deque);

        // Add elements at both ends
        deque.addFirst(5);
        deque.addLast(35);
        System.out.println("After adding elements at both ends: " + deque);

        //Add using offer
        deque.offer(25); // adds to the end
        deque.offerFirst(1); // adds to the front
        deque.offerLast(40); // adds to the end
        System.out.println("After offering elements: " + deque);

        // Peek at the first and last elements
        System.out.println("First element: " + deque.peek());// same as peekFirst()
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Remove elements from both ends
        System.out.println("Removed first element: " + deque.removeFirst());
        System.out.println("Removed last element: " + deque.removeLast());
        System.out.println("ArrayDeque after removals: " + deque);

        // Remove using poll
        System.out.println("Polled first element: " + deque.poll()); // same as pollFirst()
        System.out.println("Polled first element: " + deque.pollFirst());
        System.out.println("Polled last element: " + deque.pollLast());
        System.out.println("ArrayDeque after polling: " + deque);

        // Iterate through the ArrayDeque
        System.out.println("Iterating through ArrayDeque:");
        for (Integer num : deque) {
            System.out.println(num);
        }
    }
    
}
