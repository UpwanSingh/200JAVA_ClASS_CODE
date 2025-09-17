import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

      
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

    
        System.out.println("First fruit: " + fruits.get(0));

      
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

       
        fruits.remove("Banana");

       
        System.out.println("After removal: " + fruits);
    }
}