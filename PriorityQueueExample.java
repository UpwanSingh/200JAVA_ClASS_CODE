import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Print the PriorityQueue (note: the internal order may not be sorted)
        System.out.println("PriorityQueue elements: " + pq);

         System.out.println(pq.offer(25)); // true

         System.out.println( pq.peek());

         System.out.println(pq.remove());



        // Remove and print elements in priority order
        System.out.println("Elements removed in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
      
    
    }
}