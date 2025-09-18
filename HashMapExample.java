import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap of integers
        HashMap<Integer, String> map = new HashMap<>();

        // Add elements to the HashMap
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(2, "Duplicate Two"); // Duplicate key, will update the value
        map.put(4, "Four");

        // Print the HashMap
        System.out.println("HashMap elements: " + map);

        // Check if a key exists
        System.out.println("Contains key 2: " + map.containsKey(2));
        System.out.println("Contains key 5: " + map.containsKey(5));

        // Check if a value exists
        System.out.println("Contains value 'Three': " + map.containsValue("Three"));
        System.out.println("Contains value 'Five': " + map.containsValue("Five"));

        // Remove an element
        map.remove(2);
        System.out.println("After removing key 2: " + map);

        // Iterate through the HashMap
        System.out.println("Iterating through HashMap:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
           // traversing using entry set
        System.out.println("Traversing using entry set:");
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Get the size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Clear the HashMap
        map.clear();
        System.out.println("After clearing, is HashMap empty? " + map.isEmpty());
    }
}
