import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the HashSet
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate element, will not be added
        set.add(40);

        // Print the HashSet
        System.out.println("HashSet elements: " + set);

        // union operation
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set.addAll(set2);
        System.out.println("After union with set2: " + set);

        //inetsection operation
        HashSet<Integer> intersectionSet = new HashSet<>(set);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection with set2: " + intersectionSet);

        //diffrence operation
        HashSet<Integer> differenceSet = new HashSet<>(set);
        differenceSet.removeAll(set2);
        System.out.println("Difference with set2: " + differenceSet);

        // Check if an element exists
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Contains 40: " + set.contains(40));

        // Remove an element
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // Iterate through the HashSet
        System.out.println("Iterating through HashSet:");
        for (Integer num : set) {
            System.out.println(num);
        }

        // Get the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Clear the HashSet
        set.clear();
        System.out.println("After clearing, is HashSet empty? " + set.isEmpty());
    }
    
}
