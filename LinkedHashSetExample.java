import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of integers
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate element, will not be added
        set.add(40);

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet elements: " + set);

        // union operation
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set.addAll(set2);
        System.out.println("After union with set2: " + set);

        //intersection operation
        LinkedHashSet<Integer> intersectionSet = new LinkedHashSet<>(set);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection with set2: " + intersectionSet);

        //difference operation
        LinkedHashSet<Integer> differenceSet = new LinkedHashSet<>(set);
        differenceSet.removeAll(set2);
        System.out.println("Difference with set2: " + differenceSet);

        // Check if an element exists
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Contains 40: " + set.contains(40));

        // Remove an element
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // Iterate through the LinkedHashSet
        System.out.println("Iterating through LinkedHashSet:");
        for (Integer num : set) {
            System.out.println(num);
        }

        // Get the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + set.size());

        // Clear the LinkedHashSet
        set.clear();
        System.out.println("After clearing, is LinkedHashSet empty? " + set.isEmpty());
    }
    
}
